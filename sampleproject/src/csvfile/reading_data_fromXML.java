package csvfile;

import java.io.File;
import java.io.IOException;

import javax.swing.text.Document;
import javax.swing.text.Utilities;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.xml.sax.SAXException;

public class reading_data_fromXML {

	public class RepositoryUtil {
		private Document document;

		public void loadRepository(String repositoryFilePath) {
			if (Utilities.isFileExists(repositoryFilePath)) {

				try {
					File file = new File(repositoryFilePath);
					DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
					DocumentBuilder db = dbf.newDocumentBuilder();
					document = db.parse(file);
				} catch (ParserConfigurationException | SAXException | IOException e) {
					System.out.println(e.getMessage());
				}

			} else {
				throw new XmlFileNotFoundException("The object repository file : " + repositoryFilePath
						+ " is not found. please verify the path.");
			}

		}

		public By getLocator(String elementName) {
			By by = null;
			NodeList allElements = document.getElementsByTagName(elementName);

			if (allElements.getLength() == 1) {

				Element elem = (Element) allElements.item(0);

				if (elem.hasAttribute("locator_name") && elem.hasAttribute("locator_value")) {

					String locatorName = elem.getAttribute("locator_name");

					switch (locatorName.toLowerCase().trim()) {
					case "id":
						by = By.id(elem.getAttribute("locator_value"));
						break;
					case "name":
						by = By.name(elem.getAttribute("locator_value"));
						break;
					case "linktext":
						by = By.linkText(elem.getAttribute("locator_value"));
						break;
					case "classname":
						by = By.className(elem.getAttribute("locator_value"));
						break;
					case "partiallinktext":
						by = By.partialLinkText(elem.getAttribute("locator_value"));
						break;
					case "xpath":
						by = By.xpath(elem.getAttribute("locator_value"));
						break;
					case "css":
						by = By.cssSelector(elem.getAttribute("locator_value"));
						break;
					case "tagname":
						by = By.tagName(elem.getAttribute("locator_value"));
						break;

					default:
						throw new InvalidLocatorNameForElementInObjectRepositoryException("locator name : "
								+ locatorName + " is invalid for the element : " + elementName
								+ " in object repository. locator must be given any one of in the follwoing list (css,xpath,linktext,id,name,classname,partiallinktext,tagname)");

					}

				} else {
					throw new AttributesMissingForElementInObjectRepositoryException(
							"Either 'locator_name' attribute or 'locator_value' attribute missing for the element : "
									+ elementName
									+ " in object repository. attribute names must be written in lower case.");
				}

			} else if (allElements.getLength() > 1) {
				throw new DuplicateElementsFoundInObjectRepositoryException("Element : " + elementName
						+ " found multiple entries in Object Repository. total Entries : " + allElements.getLength());
			} else {
				throw new NoElementFoundInObjectRepositoryException("Element : " + elementName
						+ " is not found in Object Repository. Elements names are case sensitive. Please recheck the spelling and case used. if element is not created, create the element in Object Repository and rerun.");
			}

			return by;
		}

	}

}

package csvfile;

import java.io.FileReader;
import java.io.IOException;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Reading_data_Fromjson {

	public static void main(String[] args) throws IOException {

		JsonParser jsp = new JsonParser();
		FileReader fr = new FileReader("C:\\Users\\Srikath\\Documents\\jsonfile.json");
		Object obj = jsp.parse(fr);

		JsonObject empJsonObj = (JsonObject) obj;
		String fName = (String) empJsonObj.get("firstName");
		String lName = (String) empJsonObj.get("lastName");
		System.out.println(fName);
		System.out.println(lName);
		JSONArray arr = (JSONArray) empJsonObj.get("address");
		for (int i = 0; i < arr.size(); i++) {
			JSONObject address = (JSONObject) arr.get(i);
			String street = (String) address.get("street");
			String city = (String) address.get("city");
			String state = (String) address.get("state");

			System.out.println("address of " + i);
			System.out.println("street is :" + street);
			System.out.println("city is :" + city);
			System.out.println("state is :" + state);

		}
	}

}

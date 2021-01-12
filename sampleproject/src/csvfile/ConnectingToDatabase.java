package csvfile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectingToDatabase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=crm";
		String username = "sa";
		String password = "srikanth@339";
		Connection connect = DriverManager.getConnection(dbURL, username, password);
		Statement statement = connect.createStatement();
		ResultSet resultset = statement.executeQuery("select * from employye");
		ResultSetMetaData metadata = resultset.getMetaData();
		int columncount = metadata.getColumnCount();
		for (int i = 1; i < columncount; i++) {
			String columntype = metadata.getColumnLabel(i);
			String columnname = metadata.getColumnTypeName(i);
			System.out.println(columntype + ":" + columnname);
		}
		System.out.println(columncount);

		while (resultset.next()) {
			for (int colmn = 1; colmn <= columncount; colmn++) {
				System.out.print(resultset.getString(colmn));

			}
			System.out.println();
		}
		connect.close();
	}

}

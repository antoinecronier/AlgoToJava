package imiepoecjava2017.database;

import imiepoecjava2017.utils.file.FileManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

public class DBManager {

	// Mon singleton
	private static DBManager instance = null;

	protected DBManager() {
	}

	public static DBManager getInstance() {
		if (instance == null) {
			instance = new DBManager();
		}
		return instance;
	}

	// fin de mon singleton

	private Connection con;

	public void connect() {
		connect("config","dbconfig");
	}

	public void connect(String path, String file) {
		FileManager fileManager = new FileManager(path, file);
		Map<String, Object> datas = fileManager.extractFromPattern();
		connect(
				datas.get("serverAddress").toString(),
				datas.get("port").toString(),
				datas.get("dbName").toString(),
				datas.get("login").toString(),
				datas.get("password").toString()
				);
	}

	public void connect(String serverAddress, String port, String dbName,
			String login, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://" + serverAddress
					+ ":" + port + "/" + dbName, login, password);
			// Statement stmt = con.createStatement();
			// ResultSet rs = stmt.executeQuery("select * from emp");
			// while (rs.next())
			// System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
			// + rs.getString(3));
			// con.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

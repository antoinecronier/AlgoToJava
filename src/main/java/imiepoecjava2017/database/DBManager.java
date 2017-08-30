package imiepoecjava2017.database;

import imiepoecjava2017.utils.file.FileManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;

public class DBManager {

	private static DBManager instance = null;

	protected DBManager() {
		connect();
	}

	public static DBManager getInstance() {
		if (instance == null) {
			instance = new DBManager();
		}
		return instance;
	}

	private static final String PASSWORD = "password";
	private static final String LOGIN = "login";
	private static final String DB_NAME = "dbName";
	private static final String PORT = "port";
	private static final String SERVER_ADDRESS = "serverAddress";
	private static final String DBCONFIG = "dbconfig";
	private static final String CONFIG = "config";

	private Connection con;
	private String dbName = "mydb";

	/**
	 * @return the dBNAME
	 */
	public String getDBNAME() {
		return dbName;
	}

	/**
	 * @return the con
	 */
	public Connection getCon() {
		return con;
	}

	public void connect() {
		connect(CONFIG,DBCONFIG);
	}

	public void connect(String path, String file) {
		FileManager fileManager = new FileManager(path, file);
		Map<String, Object> datas = fileManager.extractFromPattern();

		String password = "";
		if (datas.containsKey(PASSWORD)) {
			password = datas.get(PASSWORD).toString();
		}

		connect(
				datas.get(SERVER_ADDRESS).toString(),
				datas.get(PORT).toString(),
				datas.get(DB_NAME).toString(),
				datas.get(LOGIN).toString(),
				password
				);
	}

	public void connect(String serverAddress, String port, String dbName,
			String login, String password) {
		this.dbName = dbName;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://" + serverAddress
					+ ":" + port + "/" + dbName, login, password);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

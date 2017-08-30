package imiepoecjava2017.database;

import imiepoecjava2017.entities.base.DBItem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseManagerHibernate {

	public static final String DB_NAME = "mynewhibernatedb";

	private EntityManager entityManager;
	private Session session;
	private SessionFactory factory;
	private Properties properties;

	public DatabaseManagerHibernate(){
		dbCreation();
		setUp();
	}

	public void dbCreation(){
		String jdbcDriver = "com.mysql.jdbc.Driver";

        Connection conn;
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=");
			Statement s = conn.createStatement();
	        s.executeQuery("CREATE DATABASE "+DB_NAME +" IF NOT EXISTS");
	        conn.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 *
	 */
	public void setUp() {
		properties = new Properties();
	    properties.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
	    properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/"+DB_NAME);
	    properties.setProperty("hibernate.connection.username", "root");
	    properties.setProperty("hibernate.connection.password", "");
	    properties.setProperty("hibernate.show_sql", "com.mysql.jdbc.Driver");
	    properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

	    factory = new Configuration().setProperties(properties).
	                            buildSessionFactory();

	    entityManager = factory.createEntityManager();
	}

	public double insert(DBItem item){
		session = factory.openSession();
		session.beginTransaction();
		entityManager.persist(item);
		session.getTransaction().commit();
		session.close();

		return item.getId();
	}
}

package br.com.galerinha.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class BancoDeDadosUtil {
	
	private Connection connection;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection pegarConexaoDoBancoDeDados() {
		try {
			Properties prop = new Properties();
			prop.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
			
			String url = prop.getProperty("datasource.url");
			String username = prop.getProperty("datasource.username");
			String password = prop.getProperty("datasource.password");
			this.connection = DriverManager.getConnection(url, username, password);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public void close() {
		try {
			this.connection.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

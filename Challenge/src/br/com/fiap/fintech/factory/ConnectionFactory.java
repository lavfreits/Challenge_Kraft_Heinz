package br.com.fiap.fintech.factory;

//classe de conexao 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";

	private static final String DB_URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";

	private static final String USERNAME = "RM97497";

	private static final String PASSWORD = "270802";

	public static Connection getConnection() {

		Connection connection = null;

		try {

			Class.forName(JDBC_DRIVER);

			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Erro ao conectar...");
			throw new RuntimeException(e);
		}

		return connection;

	}

}
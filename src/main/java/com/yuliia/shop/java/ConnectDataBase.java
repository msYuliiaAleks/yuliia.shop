package com.yuliia.shop.java;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDataBase {


        private static final String URL ="jdbc:mysql://localhost:3306/ShopDataBase?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
                "&useLegacyDatetimeCode=false&serverTimezone=UTC";
        private static final String USERNAME ="root";
        private static final String PASSWORD = "0000";

        private static java.sql.Connection connection;

        public static void Connection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Соединение с БД установлено");
            }
        } catch (SQLException e) {

        }
    }
        public static java.sql.Connection getConnection()
        { Connection();
            return connection;}
    }





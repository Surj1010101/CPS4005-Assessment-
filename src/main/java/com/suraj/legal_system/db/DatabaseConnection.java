/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.suraj.legal_system.db;

/**
 *
 * @author suraj
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    //: change the path to your SQLite DB file
    private static final String DB_URL = "jdbc:sqlite:C:gonna do it later";

    public static Connection getConnection() throws SQLException {
        //load the driver class 
        // Class.forName("org.sqlite.JDBC");
        return DriverManager.getConnection(DB_URL);
    }
}

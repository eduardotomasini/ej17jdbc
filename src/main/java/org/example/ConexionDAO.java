package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionDAO {

    protected Connection conexion = null;
    protected Statement sentencia = null;
    protected ResultSet resultado = null;
    private final String user = "root";
    private final String pass = "root";
    private final String database = "ej17_jpa";
    private final String driver = "com.mysql.cj.jdbc.Driver";

    protected void conectarBd() {
        try {
            Class.forName(driver);
            String urlDB = "jdbc:mysql://localhost:3306/" + database + "?useSSL=false";
            conexion = DriverManager.getConnection(urlDB, user, pass);
        } catch (Exception  e) {
            System.out.println(e.getMessage());
        }

    }

    protected void consultarBd(String query) {
        try {
            conectarBd();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    protected void desconectarBd() {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (conexion != null) {
                conexion.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

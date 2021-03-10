package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DB_jot {

    String MySQLURL = "jdbc:mysql://localhost:3306/jot?autoReconnect=true&useSSL=false";
    String databseUserName = "root";
    String databasePassword = "";
    Connection con = null;
    public int cnx(String user_name,String pass) {
        try {
            con = DriverManager.getConnection(MySQLURL, databseUserName, databasePassword);
            if (con != null) {
                System.out.println("cnx not null");
                Statement st = con.createStatement();
                String sql = ("SELECT * FROM user where login='"+user_name+"' and pass='"+pass+"'");
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    int id = rs.getInt("id");
//                    String str1 = rs.getString("login");
//                    String str2 = rs.getString("pass");
                    System.out.println("[" + id +  "]");
                return id;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}

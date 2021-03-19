package main.java.sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.DB_jot;

public class Controller {   //https://github.com/taufikdev/Gestion_Parking.git
    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Label display1;

    @FXML
    private Button login;

    @FXML
    private Button x;

    @FXML
    private void log(ActionEvent event) {
        try {
            if(username!=null){
            DB_jot db = new DB_jot();
            int i = db.cnx(username.getText(),password.getText());
                System.out.println(i);
                display1.setText("Welcome "+username.getText()+" your id is --> "+i);
               new Main().changeScene("../reources/login.fxml");
            }

        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }

    @FXML
    private Button cams;


    @FXML
    public void initialize() {
        //initialize the field you want here.
    }

    public void close(ActionEvent actionEvent) {
        //System.out.println("close");
        Platform.exit()
        ;
    }

    public void clicked(ActionEvent actionEvent) {
        System.out.println("hhhh");
    }
}

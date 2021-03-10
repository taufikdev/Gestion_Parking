package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Label display1;

    @FXML
    private Button login;


    @FXML
    private void log(ActionEvent event) {
        try {
            if(username!=null){
            DB_jot db = new DB_jot();
            int i = db.cnx(username.getText(),password.getText());
               // display.setVisible(true);
                System.out.println(i);
                display1.setText("Welcome "+username.getText()+" your id is --> "+i);
                //String.valueOf(i)
            }

        }catch (Exception ex){}

    }




    @FXML
    public void initialize() {
        //initialize the field you want here.
    }
}

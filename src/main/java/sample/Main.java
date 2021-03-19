package main.java.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        this.primaryStage.setTitle("Login to the system");
//      primaryStage.initStyle(StageStyle.UNDECORATED);
        Scene seScene = new Scene(root, 500, 400);
        seScene.setFill(Color.TRANSPARENT);
        this.primaryStage.setScene(seScene);
        this.primaryStage.initStyle(StageStyle.TRANSPARENT);
        this.primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
    public void changeScene(String fxml) throws Exception {
        Parent pane = FXMLLoader.load(
                getClass().getResource(fxml));

        this.primaryStage.getScene().setRoot(pane);
    }
}

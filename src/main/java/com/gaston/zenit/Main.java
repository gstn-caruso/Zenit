package com.gaston.zenit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            URL template = getClass().getClassLoader().getResource("Main.fxml");
            assert template != null;

            stage.setScene(new Scene(FXMLLoader.load(template)));
            stage.setTitle("Zenit");
            stage.show();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

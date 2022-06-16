package com.example.jigsaw;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The Jigsaw application.
 */
public class JigsawApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(JigsawApplication.class.getResource("jigsaw-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1400, 800);
        stage.setTitle("Jigsaw");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The entry point of application.
     * @param args the input arguments.
     */
    public static void main(String[] args) {
        launch();
    }
}

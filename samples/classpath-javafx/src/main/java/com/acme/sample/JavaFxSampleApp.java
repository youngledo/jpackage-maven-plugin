package com.acme.sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JavaFxSampleApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        if (Boolean.getBoolean("sample.leyden.training")) {
            Platform.exit();
            return;
        }
        var closeButton = new Button("Close");
        closeButton.setOnAction(_ -> stage.close());

        var root = new BorderPane();
        root.setCenter(new Label("JPackage Maven Plugin JavaFX sample"));
        root.setBottom(closeButton);

        stage.setTitle("JavaFX Sample");
        stage.setScene(new Scene(root, 460, 220));
        stage.show();
    }
}


package com.example.login;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LogController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
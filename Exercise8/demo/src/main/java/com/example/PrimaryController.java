package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField nameText;
    @FXML private TextField phoneText;
    @FXML private TextField emailText;
    @FXML private Label contactsLabel;

    private void echo() throws IOException {
        contactsLabel.setText(nameText.getText() + phoneText.getText() + emailText.getText());
    }
}

package application.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

// This class controls login.fxml
public class LoginController {

    @FXML
    private TextField username; // Assuming fx:id of the TextField is "username"

    @FXML
    private PasswordField password; // Assuming fx:id of the PasswordField is "password"

    @FXML
    private Button logoutButton; // Optional: if included in your FXML

    @FXML
    private Label welcomeText; // Optional: if included in your FXML

    private String loggedInUser;
    private boolean loggedIn = false;

    @FXML
    public void initialize() {
        System.out.println("LoginController initialized");
    }

    @FXML
    private void login(ActionEvent event) {
        event.consume();
        System.out.println("Username: " + username.getText() + " Password: " + password.getText());

        boolean nameCorrect = username.getText().equals("admin");
        if (nameCorrect && password.getText().equals("admin")) {
            System.out.println("Login Successful");

            try {
                // Load the next scene (e.g., Control Panel)
                FXMLLoader controlPanelLoader = new FXMLLoader(getClass().getResource("/fxml/controlpanel.fxml"));
                Parent controlPanelRoot = controlPanelLoader.load();

                Scene controlPanelScene = new Scene(controlPanelRoot);
                Stage currentStage = (Stage) username.getScene().getWindow();
                currentStage.setScene(controlPanelScene);

                // Set the scene title to "Control Panel"
                currentStage.setTitle("Control Panel");
                loggedInUser = username.getText();
                loggedIn = true;

                System.out.println("Welcome " + loggedInUser);
            } catch (IOException e) {
                System.err.println("Error loading controlpanel.fxml: " + e.getMessage());
                e.printStackTrace();
            }

        } else {
            System.out.println("Login Failed");
        }
    }
}

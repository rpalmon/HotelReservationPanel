package application.controllers;

import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import javafx.event.ActionEvent;

public class ControlPanelController {

    @FXML
    private Label welcomeText;

    @FXML
    private Button logoutButton;

    // Opens the Guest Book page
    @FXML
    private void openGuestBook(ActionEvent event) throws IOException {
        loadScene("guestbook.fxml", "Guest Book");
    }

    // Opens the Room Editor page
    @FXML
    private void openRoomEditor(ActionEvent event) throws IOException {
        loadScene("roomeditor.fxml", "Room Editor");
    }

    // Opens the Reservation Manager page
    @FXML
    private void openReservationManager(ActionEvent event) throws IOException {
        loadScene("reservationmanager.fxml", "Reservation Manager");
    }

    // Logout action to load the login scene
    @FXML
    private void logout(ActionEvent event) {
        try {
            loadLoginScene();
        } catch (IOException e) {
            handleLoadingError(e);
        }
    }

    // General method to load scenes
    private void loadScene(String fxmlFile, String title) throws IOException {
        try {
            // Ensure the path is absolute from the classpath root
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/" + fxmlFile));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) logoutButton.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle(title);
        } catch (IOException e) {
            handleLoadingError(e);
        }
    }


    // Method to load the login scene on logout
    private void loadLoginScene() throws IOException {
        loadScene("login.fxml", "Login");
    }

    // Handles loading errors
    private void handleLoadingError(IOException e) {
        System.err.println("Error loading scene: " + e.getMessage());
        e.printStackTrace();
    }

    // Sets the welcome text
    public void setWelcomeText(String text) {
        welcomeText.setText(text);
    }
}

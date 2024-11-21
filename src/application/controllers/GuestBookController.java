package application.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class GuestBookController extends BaseController {

    @FXML
    private TextField username; // TextField for ID
    @FXML
    private TextField nameField; // TextField for Name
    @FXML
    private TextField emailField; // TextField for Email
    @FXML
    private TextField phoneField; // TextField for Phone
    @FXML
    private TextArea addressArea; // TextArea for Address

    @FXML
    private Button addButton; // Button for adding a guest
    @FXML
    private Button deleteButton; // Button for deleting a guest
    @FXML
    private Button updateButton; // Button for updating guest details
    @FXML
    private Button searchButton; // Button for searching guests
    @FXML
    private Button back; // Button for returning to the previous scene

    @FXML
    public void initialize() {
        // Any initialization logic can be added here
        System.out.println("GuestBookController initialized.");
    }

    @FXML
    private void handleAddButton(ActionEvent event) {
        System.out.println("Add button clicked.");
        // Add logic to save guest information here
    }

    @FXML
    private void handleDeleteButton(ActionEvent event) {
        System.out.println("Delete button clicked.");
        // Add logic to delete guest information here
    }

    @FXML
    private void handleUpdateButton(ActionEvent event) {
        System.out.println("Update button clicked.");
        // Add logic to update guest information here
    }

    @FXML
    private void handleSearchButton(ActionEvent event) {
        System.out.println("Search button clicked.");
        // Add logic to search for a guest here
    }

}

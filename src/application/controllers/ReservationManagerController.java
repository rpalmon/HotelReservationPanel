package application.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class ReservationManagerController extends BaseController {

@FXML
    private Button back; // Back button to return to the control panel

    @FXML
    private Button saveButton; // Save button for updating reservation

    @FXML
    private Button deleteButton; // Delete button for deleting reservation

    @FXML
    private Button addButton; // Add button for adding a reservation

    @FXML
    private Button searchButton; // Search button

    @FXML
    private TextField reservationID; // TextField for Reservation ID

    @FXML
    private TextField roomID; // TextField for Room ID

    @FXML
    private TextField guestID; // TextField for Guest ID

    @FXML
    private DatePicker checkInDate; // DatePicker for Check-in Date

    @FXML
    private DatePicker checkOutDate; // DatePicker for Check-out Date

    @FXML
    private TextField totalCost; // TextField for Total Cost

    @FXML
    private ChoiceBox<String> reservationStatus; // ChoiceBox for Reservation Status

    @FXML
    private CheckBox paymentCheckBox; // CheckBox for Payment Status


    // Initialization logic
    @FXML
    public void initialize() {
        // Populate the ChoiceBox with status options
        reservationStatus.getItems().addAll("booked", "checked_in", "checked_out", "cancelled");

        // Set a default value for the ChoiceBox
        reservationStatus.setValue("booked");
    }

    // Handle the "Save" button click
    @FXML
    private void handleSaveButton(ActionEvent event) {
        // Get the selected status from the ChoiceBox
        String status = reservationStatus.getValue();

        // Save logic here (e.g., update the reservation in the database)
        System.out.println("Reservation saved with status: " + status);
    }

    // Handle the "Delete" button click
    @FXML
    private void handleDeleteButton(ActionEvent event) {
        // Logic to delete the reservation
        System.out.println("Reservation deleted.");
    }

    // Handle the "Add" button click
    @FXML
    private void handleAddButton(ActionEvent event) {
        // Logic to add a new reservation
        System.out.println("New reservation added.");
    }

    // Handle the Search button click
    @FXML
    private void handleSearchButton(ActionEvent event) {
        // Logic to search for reservations
        System.out.println("Searching for reservations.");
    }


}

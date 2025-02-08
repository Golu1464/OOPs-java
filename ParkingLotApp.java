import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ParkingLotApp extends Frame implements ActionListener {

    // Constants for parking lot dimensions
    final static int FLOORS = 5;
    final static int SLOTS = 5;

    // 2D array representing the parking lot (storing vehicle details instead of just 0 or 1)
    private Vehicle[][] parkingLot = new Vehicle[FLOORS][SLOTS];

    // Buttons for representing the parking slots
    private Button[][] parkingButtons = new Button[FLOORS][SLOTS];

    // Label for user feedback
    private Label feedbackLabel;

    // Text field for searching vehicle by number
    private TextField searchField;
    private Button searchButton;

    public ParkingLotApp() {
        setTitle("Parking Lot System");
        setSize(500, 600);
        setLayout(new GridLayout(FLOORS + 2, SLOTS));

        // Initialize parking lot (all empty)
        for (int i = 0; i < FLOORS; i++) {
            for (int j = 0; j < SLOTS; j++) {
                parkingLot[i][j] = null;  // No vehicle is parked yet
                parkingButtons[i][j] = new Button("Empty");
                parkingButtons[i][j].setBackground(Color.GREEN);
                parkingButtons[i][j].addActionListener(this);
                add(parkingButtons[i][j]);
            }
        }

        // Feedback label at the bottom
        feedbackLabel = new Label("Select a floor and park a car.");
        feedbackLabel.setAlignment(Label.CENTER);
        add(feedbackLabel);

        // Search Field for Vehicle Number
        searchField = new TextField("Enter Vehicle Number");
        add(searchField);

        // Search Button
        searchButton = new Button("Search");
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchVehicle(searchField.getText());
            }
        });
        add(searchButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Find which button was clicked
        Button clickedButton = (Button) e.getSource();

        // Locate the position of the button in the parking lot
        int floor = -1, slot = -1;
        for (int i = 0; i < FLOORS; i++) {
            for (int j = 0; j < SLOTS; j++) {
                if (clickedButton == parkingButtons[i][j]) {
                    floor = i;
                    slot = j;
                    break;
                }
            }
            if (floor != -1) break;
        }

        // If the slot is empty, park the car (update the button and parking lot array)
        if (parkingLot[floor][slot] == null) {
            String ownerName = JOptionPane.showInputDialog("Enter owner's name:");
            String modelNumber = JOptionPane.showInputDialog("Enter vehicle model:");
            String vehicleNumber = JOptionPane.showInputDialog("Enter vehicle number:");

            Vehicle newVehicle = new Vehicle(ownerName, modelNumber, vehicleNumber);
            parkingLot[floor][slot] = newVehicle;  // Store the vehicle in the parking slot
            parkingButtons[floor][slot].setLabel("Occupied");
            parkingButtons[floor][slot].setBackground(Color.RED);
            feedbackLabel.setText("Car parked in Floor " + (floor + 1) + ", Slot " + (slot + 1));
        } else {
            feedbackLabel.setText("Slot already occupied, try another slot.");
        }
    }

    // Method to search a vehicle by its vehicle number
    private void searchVehicle(String vehicleNumber) {
        for (int i = 0; i < FLOORS; i++) {
            for (int j = 0; j < SLOTS; j++) {
                if (parkingLot[i][j] != null && parkingLot[i][j].getVehicleNumber().equals(vehicleNumber)) {
                    feedbackLabel.setText("Vehicle " + vehicleNumber + " is parked at Floor " + (i + 1) + ", Slot " + (j + 1));
                    return;
                }
            }
        }
        feedbackLabel.setText("Vehicle " + vehicleNumber + " not found.");
    }

    // Method to check if the parking lot is full
    public boolean isParkingLotFull() {
        for (int i = 0; i < FLOORS; i++) {
            for (int j = 0; j < SLOTS; j++) {
                if (parkingLot[i][j] == null) {
                    return false;  // Found an empty slot
                }
            }
        }
        return true;  // No empty slots
    }

    // Vehicle class to store vehicle details
    static class Vehicle {
        private String ownerName;
        private String modelNumber;
        private String vehicleNumber;

        public Vehicle(String ownerName, String modelNumber, String vehicleNumber) {
            this.ownerName = ownerName;
            this.modelNumber = modelNumber;
            this.vehicleNumber = vehicleNumber;
        }

        public String getVehicleNumber() {
            return vehicleNumber;
        }

        @Override
        public String toString() {
            return "Owner: " + ownerName + ", Model: " + modelNumber + ", Number: " + vehicleNumber;
        }
    }

    public static void main(String[] args) {
        // Create the parking lot application
        ParkingLotApp parkingLotApp = new ParkingLotApp();

        // Check for full parking lot at startup
        if (parkingLotApp.isParkingLotFull()) {
            parkingLotApp.feedbackLabel.setText("Parking Lot is Full!");
        }
    }
}

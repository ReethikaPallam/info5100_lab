
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP USER
 */
public class Controller {
    
    @FXML
    TextField nameTextField, ageTextField, emailTextField;
    
   
    
    public void submit(ActionEvent event){
        System.out.println("Submitted");
        
        String name = nameTextField.getText();
        String age = ageTextField.getText();
        String email = emailTextField.getText();
        
        // Validation for name (compulsory)
        if (name.isEmpty()) {
            showAlert(AlertType.ERROR, "Validation Error", "Name is required.");
            return;
        }

        // Validation for age (must be a number)
        if (!isNumeric(age)) {
            showAlert(AlertType.ERROR, "Validation Error", "Age must be a valid number.");
            return;
        }

        // Validation for email (must contain '@')
        if (!email.contains("@")) {
            showAlert(AlertType.ERROR, "Validation Error", "Email must contain '@'.");
            return;
        }
        
//      Create a popup alert
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Submitted");
        alert.setHeaderText("Thank You");
        alert.setContentText("Submitted Details: Name-"+name+"age-"+age+"Email-"+email);
        alert.showAndWait();
        
    }
    
    // Helper method to check if a string is numeric
    private boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Helper method to show an alert
    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
    
}

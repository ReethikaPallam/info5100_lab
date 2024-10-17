
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
        
//      Create a popup alert
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Submitted");
        alert.setHeaderText("Thank You");
        alert.setContentText("Submitted Details: Name-"+name+"age-"+age+"Email-"+email);
        alert.showAndWait();
        
    }
    
    
}

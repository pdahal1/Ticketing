package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class hanumanctrl {

    @FXML
    private Button Submit;

    @FXML
    private TextField FirstName;

    @FXML
    private Button clear;

    @FXML
    private TextField MI;

    @FXML
    private TextField LastName;

    @FXML
    private TextField Street;

    @FXML
    private TextField City;

    @FXML
    private TextField State;

    @FXML
    private TextField Zip;

    @FXML
    private TextField Email;

    @FXML
    private TextField Phone;

    @FXML
    private Button Back;

    @FXML
    void Back(ActionEvent event) {

    }

    @FXML
    void Submit(ActionEvent event) {

    }

    @FXML
    void clear(ActionEvent event) {
    	FirstName.clear();
    	LastName.clear();
    	MI.clear();
    	Street.clear();
    	City.clear();
    	State.clear();
    	

    }

}

package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class  HelloController{

    @FXML
    private TextField InputName;

    @FXML
    private TextField InputSalary;

    @FXML
    private Button calculator;

    @FXML
    private Label epfresult;

    @FXML
    private Label etfresult;

    @FXML
    void cal(ActionEvent event) {

        String name =InputName.getText();
        String salary=InputSalary.getText();

        double salary1= Double.parseDouble(salary);

        double epf=(salary1/100)*8;

        double etf=(salary1/100)*12;

        epfresult.setText("Rs. "+epf+"");
        etfresult.setText("Rs."+etf+"");



    }

}

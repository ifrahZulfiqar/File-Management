package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class HelloController {

    @FXML public VBox mainContainer;

    @FXML
    protected void selectionClicked(MouseEvent e) throws IOException {
        switch (((Button) e.getSource()).getId()) {
            case "passenger" -> {
                mainContainer.getChildren().removeAll();
                mainContainer.getChildren().add(new FXMLLoader(HelloApplication.class.getResource("passengerManagement.fxml")).load());
            }
            case "plane" -> {
                mainContainer.getChildren().removeAll();
                mainContainer.getChildren().add(new FXMLLoader(HelloApplication.class.getResource("planeManagement.fxml")).load());
            }
            default -> {
                mainContainer.getChildren().removeAll();
                mainContainer.getChildren().add(new FXMLLoader(HelloApplication.class.getResource("flightManagement.fxml")).load());
            }
        }
    }
    @FXML
    protected void selectionHovered() {

    }
    @FXML
    protected void selectionExited() {

    }
}
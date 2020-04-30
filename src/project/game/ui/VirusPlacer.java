package project.game.ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import project.game.logic.VirusManager;

public class VirusPlacer {
    static double width = 200;
    static boolean readyToPlace = false;
    private String labelText = "World population infected = ";
    private Button virusButton = new Button("Infect a block!");
    private Label virusLabel = new Label(labelText);
    private VirusManager virusManager;

    public VirusPlacer(Group virusGroup, VirusManager virusManager){
        this.virusManager = virusManager;
        virusButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                readyToPlace = true;
            }
        });
        virusLabel.setStyle("-fx-text-fill: white");
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setMinWidth(200);
        vBox.getChildren().add(virusButton);
        vBox.getChildren().add(virusLabel);
        virusGroup.getChildren().add(vBox);
    }

    public void placeVirus(int x, int y){
        virusManager.infectBlock(x,y);
        readyToPlace = false;
        System.out.println("virus has now been send from ui!");
    }
}

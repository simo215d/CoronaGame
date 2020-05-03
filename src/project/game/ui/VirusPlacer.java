package project.game.ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import project.game.logic.Game;
import project.game.logic.VirusManager;

import java.util.Observable;
import java.util.Observer;

public class VirusPlacer implements Observer {
    static double width = 200;
    static boolean readyToPlace = false;
    private String infectedText = "World population infected = ";
    private String deadText = "    World population dead = ";
    private String buttonText = "Infect a block! ";
    private Button virusButton = new Button(buttonText+3);
    private Label virusLabel = new Label(infectedText+" 0\n"+deadText+"0");
    private VirusManager virusManager;
    private Scene scene;

    public VirusPlacer(Group virusGroup, VirusManager virusManager, Scene scene, Game game){
        this.virusManager = virusManager;
        virusManager.addObserver(this);
        this.scene = scene;
        virusButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!(virusManager.getAvailableVirusPlacements()>0)){
                    game.startSimulation();
                    return;
                }
                readyToPlace = true;
                Image img = new Image(getClass().getResourceAsStream("/project/resources/CoronaCursor1.png"));
                ImageCursor cursor = new ImageCursor(img, -15, -15);
                scene.setCursor(cursor);
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
        scene.setCursor(Cursor.DEFAULT);
        System.out.println("virus has now been send from ui!");
        if (virusManager.getAvailableVirusPlacements()==0){
            virusButton.setText("Start simulation");
        } else virusButton.setText(buttonText+virusManager.getAvailableVirusPlacements());
    }

    @Override
    public void update(Observable o, Object arg) {
        virusLabel.setText(infectedText+virusManager.getInfectionPercentage()+"\n"+deadText+virusManager.getDeathPercentage());
    }
}

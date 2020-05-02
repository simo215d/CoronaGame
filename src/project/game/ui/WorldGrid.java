package project.game.ui;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import project.game.logic.Block;
import project.game.logic.World;

import java.util.Observable;
import java.util.Observer;

public class WorldGrid implements Observer {
    private GameController controller;

    public WorldGrid(GameController controller){
        this.controller = controller;
    }

    public void render(){
        System.out.println("grid is rendering");
        //clear the board of existing rectangles. ps. this takes up a lot of process time and can be done smarter.
        controller.getGridGroup().getChildren().clear();
        for (int i = 0; i < World.WORLD_X; i++) {
            for (int j = 0; j < World.WORLD_Y; j++) {
                //if current block is water, then no need to have a rectangle represent it
                if (controller.getGame().getWorld().getBlocks()[i][j].getContinent().equals(World.WATER)){
                    continue;
                }
                //rectangle dimensions
                double width = GameController.SCREEN_X/(double)World.WORLD_X;
                double height = GameController.SCREEN_Y/(double)World.WORLD_Y;
                //rectangle position
                double x = i*width;
                double y = j*height;
                //create the rectangle and set color based on its infection status
                Rectangle rectangle = new Rectangle(x,y,width,height);
                switch (controller.getGame().getWorld().getBlocks()[i][j].getInfectionStatus()){
                    case Block.NEUTRAL: if (controller.getGame().getWorld().getBlocks()[i][j].isContinentIsHighlighted())rectangle.setFill(Color.rgb(0,255,0,0.25)); else rectangle.setFill(Color.rgb(0,0,0,0)); break;
                    case Block.DEAD: rectangle.setFill(Color.rgb(0,0,0,0.5)); break;
                    case Block.INFECTED: rectangle.setFill(Color.rgb(255,0,0,0.5)); break;
                    case Block.CURED: rectangle.setFill(Color.rgb(0,0,255,0.5)); break;
                }
                controller.getGridGroup().getChildren().add(rectangle);
            }
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        render();
    }
}

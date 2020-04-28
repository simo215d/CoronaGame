package project.game.ui;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import project.game.logic.World;

import java.awt.event.MouseEvent;

public class ClickOnBlock {
    private Scene scene;
    private World world;

    public ClickOnBlock(Scene scene, World world){
        this.scene = scene;
        this.world = world;
        scene.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>()  {
            @Override
            public void handle(javafx.scene.input.MouseEvent mouseEvent) {
                int x = (int)(mouseEvent.getSceneX() / 4);
                int y = (int)(mouseEvent.getSceneY() / 4);

                System.out.println("X; " + x + " Y; " + y);
                System.out.println("Selected Continent; " + world.getBlocks()[x][y].getContinent() + " Total blocks; " + world.getContinent().getTotalBlocks(world.getBlocks()[x][y].getContinent()));
                System.out.println("Selected Continent; " + world.getBlocks()[x][y].getContinent() + " Neutral blocks; " + world.getContinent().getNeutralBlocks(world.getBlocks()[x][y].getContinent()));
                System.out.println("Selected Continent; " + world.getBlocks()[x][y].getContinent() + " Infected blocks; " + world.getContinent().getInfectedBlocks(world.getBlocks()[x][y].getContinent()));
                System.out.println("Selected Continent; " + world.getBlocks()[x][y].getContinent() + " Dead blocks; " + world.getContinent().getDeadBlocks(world.getBlocks()[x][y].getContinent()));
                System.out.println("Selected Continent; " + world.getBlocks()[x][y].getContinent() + " Cured blocks; " + world.getContinent().getCuredBlocks(world.getBlocks()[x][y].getContinent()));

            }
        });
    }
}
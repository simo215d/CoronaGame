package project.game.ui;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import project.game.logic.World;

public class ClickOnBlock {
    private Scene scene;
    private World world;
    private Group infoGroup;
    private VirusPlacer virusPlacer;

    public ClickOnBlock(Scene scene, World world, Group infoGroup, Group virusGroup){
        this.scene = scene;
        this.world = world;
        this.infoGroup = infoGroup;
        virusPlacer = new VirusPlacer(virusGroup, world.getVirusManager());
        scene.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>()  {
            @Override
            public void handle(javafx.scene.input.MouseEvent mouseEvent) {
                //4 comes from the scale factor between the number of blocks and size of the screen. x=800/200 and 600/150
                int x = (int)(mouseEvent.getSceneX() / 4);
                int y = (int)(mouseEvent.getSceneY() / 4);
                //if we are ready to place then place and nothing more.
                if (VirusPlacer.readyToPlace){
                    virusPlacer.placeVirus(x,y);
                    return;
                }
                //System.out.println("X; " + x + " Y; " + y);
                //get a continent based on the x and y. get values from continent based on the continent
                String continent = world.getBlocks()[x][y].getContinent();
                int totalBlocks = world.getContinent().getTotalBlocks(world.getBlocks()[x][y].getContinent());
                int neutralBlocks = world.getContinent().getNeutralBlocks(world.getBlocks()[x][y].getContinent());
                int infectedBlocks = world.getContinent().getInfectedBlocks(world.getBlocks()[x][y].getContinent());
                int deadBlocks = world.getContinent().getDeadBlocks(world.getBlocks()[x][y].getContinent());
                int curedBlocks = world.getContinent().getCuredBlocks(world.getBlocks()[x][y].getContinent());
                displayContinentInfo(continent, totalBlocks, neutralBlocks, infectedBlocks, deadBlocks, curedBlocks);
                System.out.println("successfully clicked a continent and you should see info!");
            }
        });
    }

    private void displayContinentInfo(String continent, int totalBlocks, int neutralBlocks, int infectedBlocks, int deadBlocks, int curedBlocks){
        infoGroup.getChildren().clear();
        //Rectangle backgroundRectangle = new Rectangle(0,0,500,40);
        //backgroundRectangle.setFill(Color.TRANSPARENT);
        Label label = new Label("Selected continent: "+continent+"\nTotal blocks: "+totalBlocks+". \nNeutral blocks: "+neutralBlocks+". \nInfected blocks: "+infectedBlocks+". \nDead blocks: "+deadBlocks+". \nCured blocks: "+curedBlocks);
        label.setStyle("-fx-text-fill: white");
        //infoGroup.getChildren().add(backgroundRectangle);
        infoGroup.getChildren().add(label);
    }
}
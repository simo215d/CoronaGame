package project.game.ui;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import project.game.logic.Game;

public class GameController {
    public static final int SCREEN_X = 800;
    public static final int SCREEN_Y = 600;
    private Game game = new Game();
    private ClickOnBlock clickOnBlock;
    private WorldGrid worldGrid = new WorldGrid(this);
    private ImageView worldImage;
    private Group backgroundGroup = new Group();
    private Group gridGroup = new Group();
    private Group infoGroup = new Group();
    private Group root = new Group();
    private Scene scene;

    public void newGame(Stage stage){
        //observer pattern might not be the correct thing here but we will see later
        game.getWorld().addObserver(worldGrid);
        //create the image which will be the background
        worldImage = new ImageView(new Image(getClass().getResource("/project/resources/WorldMap.png").toString()));
        worldImage.setFitWidth(SCREEN_X);
        worldImage.setFitHeight(SCREEN_Y);
        //group our things so its easier to manage later
        backgroundGroup.getChildren().add(worldImage);
        root.getChildren().add(backgroundGroup);
        root.getChildren().add(gridGroup);
        root.getChildren().add(infoGroup);
        scene = new Scene(root,SCREEN_X,SCREEN_Y);
        stage.setScene(scene);
        game.start();
        //instantiate clickOnBlock
        clickOnBlock = new ClickOnBlock(scene, game.getWorld(), infoGroup);
    }

    public Group getGridGroup(){
        return gridGroup;
    }

    public Game getGame(){
        return game;
    }
}

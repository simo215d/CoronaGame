package project.game.ui;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import project.game.logic.Game;

import java.util.Observable;
import java.util.Observer;

public class GameController implements Observer {
    public static final int SCREEN_X = 800;
    public static final int SCREEN_Y = 600;
    private Game game = new Game();
    private WorldGrid worldGrid = new WorldGrid();
    private ImageView worldImage;
    private Group gridGroup = new Group();
    private Group backgroundGroup = new Group();
    private Group root = new Group();
    private Scene scene;

    public void newGame(Stage stage){
        //observer pattern might not be the correct thing here but we will see later
        game.addObserver(this);
        //create the image which will be the background
        worldImage = new ImageView(new Image(getClass().getResource("/project/resources/WorldMap.png").toString()));
        worldImage.setFitWidth(SCREEN_X);
        worldImage.setFitHeight(SCREEN_Y);
        //group our things so its easier to manage later
        backgroundGroup.getChildren().add(worldImage);
        root.getChildren().add(backgroundGroup);
        root.getChildren().add(gridGroup);
        scene = new Scene(root,SCREEN_X,SCREEN_Y);
        stage.setScene(scene);
        game.start();
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("HEY");
        render();
    }

    private void render(){
        System.out.println("game controller is rendering");
        worldGrid.render(this);
    }

    public Group getGridGroup(){
        return gridGroup;
    }
}

package project.game.ui;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import project.game.logic.Game;

public class GameController {
    private Game game = new Game();
    private ImageView worldImage;
    private Scene scene;

    public void newGame(Stage stage){
        Image image = new Image(getClass().getResource("/project/resources/WorldMap.png").toString());
        worldImage = new ImageView(image);
        worldImage.setFitWidth(800);
        worldImage.setFitHeight(600);
        Group go = new Group(worldImage);
        scene = new Scene(go,800,600);
        stage.setScene(scene);
        game.start();
    }
}

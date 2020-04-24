package project.game.ui;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import project.game.logic.Game;

public class GameController {
    private Game game = new Game();
    public void hello(Stage stage){
        System.out.println("hi im the test in game!");
        stage.setScene(new Scene(new Label("CORANA ALPHA 0.1"),800,600));
        game.start();
    }
}

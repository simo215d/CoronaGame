package project.menu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import project.game.ui.GameController;

public class Main extends Application {
    GameController gameController = new GameController();
    static Main main;

    @Override
    public void start(Stage primaryStage) throws Exception{
        main = this;
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage.setTitle("Corona Game");
        primaryStage.setScene(new Scene(root, GameController.SCREEN_X, GameController.SCREEN_Y));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

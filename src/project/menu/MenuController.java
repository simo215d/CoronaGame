package project.menu;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class MenuController {
    public void newGameAction(ActionEvent event){
        System.out.println("new game button clicked!");
        //we get the stage from which the button is attached to
        Node source = (Node)event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        //we then send our stage as a reference to game controller so it knows what stage that it should set its scene into
        Main.main.gameController.newGame(stage);
    }

    public void loadGameAction(ActionEvent event){
        System.out.println("old game loading up!");
    }

    public void quitGameAction(ActionEvent event){
        System.out.println("shutting down!");
        //we get the stage from which the button is attached to
        Node source = (Node)event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        //we then close that stage which means we shut down the program
        stage.close();
    }
}

package project.menu;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class MenuController {
    public void newGameAction(ActionEvent event){
        Node source = (Node)event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        System.out.println("new game starting up!");
        Main.main.gameController.newGame(stage);
    }

    public void loadGameAction(ActionEvent event){
        System.out.println("old game loading up!");
    }

    public void quitGameAction(ActionEvent event){
        Node source = (Node)event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
        System.out.println("shutting down!");
    }
}

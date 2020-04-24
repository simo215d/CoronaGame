package project.menu;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.stage.Window;

public class MenuController {
    public void newGameAction(ActionEvent event){
        System.out.println("new game starting up!");
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

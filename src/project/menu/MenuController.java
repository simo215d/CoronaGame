package project.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import project.game.database.MysqlImageDAO;

import java.net.MalformedURLException;
import java.net.URL;

public class MenuController {
    @FXML
    ImageView imageViewTest;

    public void initialize(){
        //get the file path from database
        MysqlImageDAO mysqlImageDAO = new MysqlImageDAO();
        String imageURL = mysqlImageDAO.getImageUrl();
        //do not proceed if sql error happen somewhere
        if (imageURL.equals("error")) return;
        try {
            //to access the internet we need to put our url into an URL class
            Image image = new Image(String.valueOf(new URL(imageURL)));
            //set our new image
            imageViewTest.setImage(image);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

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

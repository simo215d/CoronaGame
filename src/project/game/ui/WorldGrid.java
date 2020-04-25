package project.game.ui;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class WorldGrid {
    private final static int WORLD_X = 200;
    private final static int WORLD_Y = 150;

    public void render(GameController controller){
        //this method is far from over, so no comments here
        System.out.println("grid is rendering");
        boolean shouldBeGreen = false;
        for (int i = 0; i < WORLD_X; i++) {
            if (i%2==0) shouldBeGreen=true;
            else shouldBeGreen=false;
            for (int j = 0; j < WORLD_Y; j++) {
                Rectangle rectangle = new Rectangle(i*((float)GameController.SCREEN_X/WORLD_X),j*((float)GameController.SCREEN_Y/WORLD_Y),(float)GameController.SCREEN_X/WORLD_X,(float)GameController.SCREEN_Y/WORLD_Y);
                if (shouldBeGreen) {
                    rectangle.setFill(Color.rgb(255,255,255,0.25f));
                    shouldBeGreen=false;
                }
                else {
                    rectangle.setFill(Color.rgb(150,150,255,0.25f));
                    shouldBeGreen=true;
                }
                controller.getGridGroup().getChildren().add(rectangle);
            }
        }
    }
}

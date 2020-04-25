package project.game.logic;

import java.util.Observable;

public class World extends Observable {

    private final static int WORLD_X = 200;
    private final static int WORLD_Y = 150;

    private Block[][] blocks = new Block[WORLD_X][WORLD_Y];

    public void activateBlocks() {
        for (int i = 0; i < WORLD_X ; i++) {
            for (int j = 0; j < WORLD_Y ; j++) {
                blocks[i][j] = new Block("North-America",i,j);
            }
        }
    }

    public void render(){
        setChanged();
        notifyObservers();
    }
}

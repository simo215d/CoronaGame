package project.game.logic;

import java.util.Observable;

public class World extends Observable {

    public final static int WORLD_X = 200;
    public final static int WORLD_Y = 150;

    private Block[][] blocks = new Block[WORLD_X][WORLD_Y];

    public void activateBlocks() {
        for (int i = 0; i < WORLD_X ; i++) {
            for (int j = 0; j < WORLD_Y ; j++) {
                blocks[i][j] = new Block("North-America",i,j);
            }
        }
        //test blocks to see if the render works
        blocks[1][2].setInfectionStatus("dead");
        blocks[4][10].setInfectionStatus("cured");
        blocks[3][7].setInfectionStatus("infected");
        blocks[0][0].setInfectionStatus("infected");
        blocks[WORLD_X-1][WORLD_Y-1].setInfectionStatus("infected");
        blocks[0][WORLD_Y-1].setInfectionStatus("infected");
        blocks[WORLD_X-1][0].setInfectionStatus("infected");
    }

    public void render(){
        setChanged();
        notifyObservers();
    }

    public Block[][] getBlocks(){
        return blocks;
    }
}

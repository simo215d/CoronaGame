package project.game.logic;

import java.util.Observable;

public class World extends Observable {
    public static final String WATER = "Water";
    public static final String NORTH_AMERICA = "North America";
    public static final String SOUTH_AMERICA = "South America";
    public static final String EUROPE = "Europe";
    public static final String ASIA = "Asia";
    public static final String AFRICA = "Africa";
    public static final String AUSTRALIA = "Australia";
    public static final String[] CONTINENTS = new String[]{NORTH_AMERICA,SOUTH_AMERICA, EUROPE, ASIA, AFRICA, AUSTRALIA};

    public final static int WORLD_X = 200;
    public final static int WORLD_Y = 150;

    private Block[][] blocks = new Block[WORLD_X][WORLD_Y];

    public void activateBlocks() {
        for (int i = 0; i < WORLD_X ; i++) {
            for (int j = 0; j < WORLD_Y ; j++) {
                blocks[i][j] = new Block("Unassigned",i,j);
            }
        }
        setNorthAmericaBlocks();
        setWaterBlocks();
        //test blocks to see if the render works
        blocks[1][2].setInfectionStatus("dead");
        blocks[4][10].setInfectionStatus("cured");
        blocks[3][7].setInfectionStatus("infected");
        blocks[0][0].setInfectionStatus("infected");
        blocks[WORLD_X-1][WORLD_Y-1].setInfectionStatus("infected");
        blocks[0][WORLD_Y-1].setInfectionStatus("infected");
        blocks[WORLD_X-1][0].setInfectionStatus("infected");
    }

    private void setNorthAmericaBlocks(){
        //TODO make sets collection to represent a line which belongs to the continent
    }

    //this method is called when all continents are established, then all the remaining unassigned blocks will become water
    private void setWaterBlocks(){
        for (int i = 0; i < WORLD_X; i++) {
            for (int j = 0; j < WORLD_Y; j++) {
                if (blocks[i][j].getContinent().equals("Unassigned")){
                    blocks[i][j].setContinent(WATER);
                }
            }
        }
    }

    public void render(){
        setChanged();
        notifyObservers();
    }

    public Block[][] getBlocks(){
        return blocks;
    }
}

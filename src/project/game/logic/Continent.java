package project.game.logic;

public class Continent {
    private Block[][] blocks;

    public Continent(Block[][] blocks){
        this.blocks = blocks;
    }

    public int getTotalBlocks(String continentName){
        int totalBlocks = 0;
        for (int i = 0; i < World.WORLD_X; i++) {
            for (int j = 0; j < World.WORLD_Y; j++) {
                if (blocks[i][j].getContinent().equals(continentName)) {
                    totalBlocks++;
                }
            }
        }
        return totalBlocks;
    }
    public int getNeutralBlocks(String continentName){
        int neutralBlocks = 0;
        for (int i = 0; i < World.WORLD_X; i++) {
            for (int j = 0; j < World.WORLD_Y; j++) {
                if (blocks[i][j].getContinent().equals(continentName)) {
                    if (blocks[i][j].getInfectionStatus().equals(Block.NEUTRAL)) {
                        neutralBlocks++;
                    }
                }
            }
        }
        return neutralBlocks;
    }

    public int getDeadBlocks(String continentName){
        int deadBlocks = 0;
        for (int i = 0; i < World.WORLD_X; i++) {
            for (int j = 0; j < World.WORLD_Y; j++) {
                if (blocks[i][j].getContinent().equals(continentName)) {
                    if (blocks[i][j].getInfectionStatus().equals(Block.DEAD)) {
                        deadBlocks++;
                    }
                }
            }
        }
        return deadBlocks;
    }
    public int getInfectedBlocks(String continentName){
        int infectedBlocks = 0;
        for (int i = 0; i < World.WORLD_X; i++) {
            for (int j = 0; j < World.WORLD_Y; j++) {
                if (blocks[i][j].getContinent().equals(continentName)) {
                    if (blocks[i][j].getInfectionStatus().equals(Block.INFECTED)) {
                        infectedBlocks++;
                    }
                }
            }
        }
        return infectedBlocks;
    }
    public int getCuredBlocks(String continentName){
        int curedBlocks = 0;
        for (int i = 0; i < World.WORLD_X; i++) {
            for (int j = 0; j < World.WORLD_Y; j++) {
                if (blocks[i][j].getContinent().equals(continentName)) {
                    if (blocks[i][j].getInfectionStatus().equals(Block.CURED)) {
                        curedBlocks++;
                    }
                }
            }
        }
        return curedBlocks;
    }
}

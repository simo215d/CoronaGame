package project.game.logic;

import java.util.Observable;

public class VirusManager extends Observable {
    private int availableVirusPlacements = 3;
    private double infectionPercentage = 0;
    private double deathPercentage = 0;
    private int totalBlocksNotWater = 0;
    private World world;

    public VirusManager(World world){
        this.world = world;
    }

    public void infectBlock(int x, int y){
        //go out if no virus placements available
        if (availableVirusPlacements<1){
            return;
        }
        world.setInfectionStatusForBlock(Block.INFECTED, x, y);
        availableVirusPlacements--;
        world.render();
        System.out.println("successfully placed and rendered");
    }

    public void updateStats(){
        if (totalBlocksNotWater==0){
            for (Block[] blockX : world.getBlocks()){
                for (Block blockXY : blockX){
                    if (blockXY.getContinent().equals(World.WATER)) continue;
                    totalBlocksNotWater++;
                }
            }
        }
        calculateInfectedPercentage();
        calculateDeathPercentage();
        setChanged();
        notifyObservers();
    }

    private void calculateInfectedPercentage(){
        int infected = 0;
        for (Block[] blockX : world.getBlocks()){
            for (Block blockXY : blockX){
                if (blockXY.getInfectionStatus().equals(Block.INFECTED)) infected++;
            }
        }
        infectionPercentage = ((double)infected/(double)totalBlocksNotWater)*100;
        System.out.println(infectionPercentage);
    }

    private void calculateDeathPercentage(){
        int dead = 0;
        for (Block[] blockX : world.getBlocks()){
            for (Block blockXY : blockX){
                if (blockXY.getInfectionStatus().equals(Block.DEAD)) dead++;
            }
        }
        infectionPercentage = (dead/totalBlocksNotWater)*100;
    }

    public int getAvailableVirusPlacements(){
        return availableVirusPlacements;
    }

    public double getInfectionPercentage(){
        return infectionPercentage;
    }

    public double getDeathPercentage(){
        return deathPercentage;
    }
}

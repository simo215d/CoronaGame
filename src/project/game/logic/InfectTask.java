package project.game.logic;

import javafx.application.Platform;
import javafx.util.Pair;

import java.util.ArrayList;

public class InfectTask implements Runnable {
    private int sleepTime = 1000;
    private ArrayList<Pair<Integer, Integer>> blockCoordinates = new ArrayList<>();
    private World world;

    public InfectTask(World world){
        this.world = world;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    step();
                }
            });
            //then sleep
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void step(){
        int infected = 0;
        for (int i = 0; i < World.WORLD_X; i++) {
            for (int j = 0; j < World.WORLD_Y; j++) {
                if (world.getBlocks()[i][j].getInfectionStatus().equals(Block.INFECTED)){
                    infected++;
                }
            }
        }
        System.out.println("infected BEFORE plague "+infected);
        //for all infected blocks infect more
        for (int i = 0; i < World.WORLD_X; i++) {
            for (int j = 0; j < World.WORLD_Y; j++) {
                if (world.getBlocks()[i][j].getInfectionStatus().equals(Block.INFECTED)){
                    blockCoordinates.add(new Pair(i,j));
                }
            }
        }
        for (Pair pair : blockCoordinates){
            world.spreadVirus((int)pair.getKey(), (int)pair.getValue());
        }
        infected=0;
        for (int i = 0; i < World.WORLD_X; i++) {
            for (int j = 0; j < World.WORLD_Y; j++) {
                if (world.getBlocks()[i][j].getInfectionStatus().equals(Block.INFECTED)){
                    infected++;
                }
            }
        }
        System.out.println("infected AFTER plague "+infected);
        world.render();
    }
}

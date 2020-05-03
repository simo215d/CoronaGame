package project.game.logic;

import java.util.Observable;

public class Game extends Observable {
    private World world = new World();

    public void start(){
        System.out.println("THE GAME HAS BEGUN!");
        world.activateBlocks();
        world.render();
    }

    public World getWorld(){
        return world;
    }

    public void startSimulation(){
        System.out.println("simulation begun");
        Thread thread = new Thread(new InfectTask(world));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        world.render();
    }
}

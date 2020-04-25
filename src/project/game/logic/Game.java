package project.game.logic;

import java.util.Observable;

public class Game extends Observable {
    //TODO MAKE 2d ARRAY WITH AREA CLASS WHICH ARE HAVE A CONTINENT VARIABLE AND A LIVE/DEAD/IMMUNE/INFECTED/CURED
    //TODO SHOULD THE CONTROLLER LOGIC MAYBE BE IN HERE???
    //TODO måske skal det ud på en seperat thread som opdaterer og sleeper
    //maybe a world object, and the world object contains the blocks. world has a render method which goes into ui package?
    public void start(){
        System.out.println("THE GAME HAS BEGUN!");

        World world = new World();
        world.activateBlocks();
        setChanged();
        notifyObservers();
    }
}

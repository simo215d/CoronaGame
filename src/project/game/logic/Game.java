package project.game.logic;

import java.util.Observable;

public class Game extends Observable {
    //TODO MAKE 2d ARRAY WITH AREA CLASS WHICH ARE HAVE A CONTINENT VARIABLE AND A LIVE/DEAD/IMMUNE/INFECTED/CURED
    //TODO SHOULD THE CONTROLLER LOGIC MAYBE BE IN HERE???
    public void start(){
        System.out.println("THE GAME HAS BEGUN!");
        setChanged();
        notifyObservers();
    }
}

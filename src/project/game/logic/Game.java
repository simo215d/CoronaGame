package project.game.logic;

import java.util.Observable;

public class Game extends Observable {
    public void start(){
        System.out.println("THE GAME HAS BEGUN!");
        setChanged();
        notifyObservers();
    }
}

package project.game.logic;

import javafx.util.Pair;

import java.util.ArrayList;
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
    }

    private void setNorthAmericaBlocks(){
        //list of a pair of a y coordinate with 2 x coordinates which makes a line
        ArrayList<Pair<Integer, Pair<Integer, Integer>>> NAMap = new ArrayList<>();
        //greenland coordinates
        NAMap.add(new Pair<>(19,new Pair<>(76,80)));
        NAMap.add(new Pair<>(20,new Pair<>(71,83)));
        NAMap.add(new Pair<>(21,new Pair<>(66,83)));
        NAMap.add(new Pair<>(22,new Pair<>(63,88)));
        NAMap.add(new Pair<>(23,new Pair<>(62,87)));
        NAMap.add(new Pair<>(24,new Pair<>(62,86)));
        NAMap.add(new Pair<>(25,new Pair<>(62,85)));
        NAMap.add(new Pair<>(26,new Pair<>(59,84)));
        NAMap.add(new Pair<>(27,new Pair<>(59,85)));
        NAMap.add(new Pair<>(28,new Pair<>(59,85)));
        NAMap.add(new Pair<>(29,new Pair<>(60,85)));
        NAMap.add(new Pair<>(30,new Pair<>(65,85)));
        NAMap.add(new Pair<>(31,new Pair<>(66,85)));
        NAMap.add(new Pair<>(32,new Pair<>(67,84)));
        NAMap.add(new Pair<>(33,new Pair<>(67,83)));
        NAMap.add(new Pair<>(34,new Pair<>(67,84)));
        NAMap.add(new Pair<>(35,new Pair<>(68,84)));
        NAMap.add(new Pair<>(36,new Pair<>(67,84)));
        NAMap.add(new Pair<>(37,new Pair<>(69,82)));
        NAMap.add(new Pair<>(38,new Pair<>(68,79)));
        NAMap.add(new Pair<>(39,new Pair<>(68,78)));
        NAMap.add(new Pair<>(40,new Pair<>(68,77)));
        NAMap.add(new Pair<>(41,new Pair<>(69,75)));
        NAMap.add(new Pair<>(42,new Pair<>(69,75)));
        NAMap.add(new Pair<>(43,new Pair<>(69,74)));
        NAMap.add(new Pair<>(44,new Pair<>(70,74)));
        NAMap.add(new Pair<>(45,new Pair<>(72,73)));
        //mainland coordinates
        NAMap.add(new Pair<>(20,new Pair<>(54,63)));
        NAMap.add(new Pair<>(21,new Pair<>(51,64)));
        NAMap.add(new Pair<>(22,new Pair<>(49,62)));
        NAMap.add(new Pair<>(23,new Pair<>(48,61)));
        NAMap.add(new Pair<>(24,new Pair<>(47,60)));
        NAMap.add(new Pair<>(25,new Pair<>(47,58)));
        NAMap.add(new Pair<>(26,new Pair<>(39,57)));
        NAMap.add(new Pair<>(27,new Pair<>(38,56)));
        NAMap.add(new Pair<>(28,new Pair<>(35,56)));
        NAMap.add(new Pair<>(29,new Pair<>(33,56)));
        NAMap.add(new Pair<>(30,new Pair<>(36,55)));
        NAMap.add(new Pair<>(31,new Pair<>(33,55)));
        NAMap.add(new Pair<>(32,new Pair<>(33,56)));
        NAMap.add(new Pair<>(33,new Pair<>(32,57)));
        NAMap.add(new Pair<>(34,new Pair<>(32,58)));
        NAMap.add(new Pair<>(35,new Pair<>(36,60)));
        NAMap.add(new Pair<>(36,new Pair<>(36,61)));
        NAMap.add(new Pair<>(36,new Pair<>(15,61)));
        NAMap.add(new Pair<>(37,new Pair<>(13,61)));
        NAMap.add(new Pair<>(38,new Pair<>(13,62)));
        NAMap.add(new Pair<>(39,new Pair<>(14,64)));
        NAMap.add(new Pair<>(40,new Pair<>(14,64)));
        NAMap.add(new Pair<>(41,new Pair<>(12,63)));
        NAMap.add(new Pair<>(42,new Pair<>(14,63)));
        NAMap.add(new Pair<>(43,new Pair<>(14,49)));
        NAMap.add(new Pair<>(44,new Pair<>(13,48)));
        //canada quebec
        NAMap.add(new Pair<>(44,new Pair<>(55,59)));
        NAMap.add(new Pair<>(45,new Pair<>(55,60)));
        NAMap.add(new Pair<>(46,new Pair<>(55,62)));
        NAMap.add(new Pair<>(47,new Pair<>(55,63)));
        NAMap.add(new Pair<>(48,new Pair<>(56,64)));
        NAMap.add(new Pair<>(49,new Pair<>(56,65)));
        NAMap.add(new Pair<>(50,new Pair<>(55,66)));
        NAMap.add(new Pair<>(51,new Pair<>(55,67)));
        NAMap.add(new Pair<>(52,new Pair<>(55,67)));
        //back to mainland
        NAMap.add(new Pair<>(45,new Pair<>(14,48)));
        NAMap.add(new Pair<>(46,new Pair<>(14,19)));
        NAMap.add(new Pair<>(46,new Pair<>(25,48)));
        NAMap.add(new Pair<>(47,new Pair<>(26,49)));
        NAMap.add(new Pair<>(48,new Pair<>(27,49)));
        NAMap.add(new Pair<>(49,new Pair<>(28,52)));
        NAMap.add(new Pair<>(50,new Pair<>(29,54)));
        NAMap.add(new Pair<>(51,new Pair<>(30,54)));
        NAMap.add(new Pair<>(52,new Pair<>(31,55)));
        NAMap.add(new Pair<>(53,new Pair<>(31,67)));
        NAMap.add(new Pair<>(54,new Pair<>(31,64)));
        NAMap.add(new Pair<>(54,new Pair<>(65,67)));
        NAMap.add(new Pair<>(55,new Pair<>(65,68)));
        NAMap.add(new Pair<>(55,new Pair<>(33,63)));
        NAMap.add(new Pair<>(56,new Pair<>(33,63)));
        NAMap.add(new Pair<>(57,new Pair<>(33,65)));
        NAMap.add(new Pair<>(58,new Pair<>(33,60)));
        NAMap.add(new Pair<>(59,new Pair<>(33,60)));
        NAMap.add(new Pair<>(60,new Pair<>(33,60)));
        NAMap.add(new Pair<>(61,new Pair<>(33,58)));
        NAMap.add(new Pair<>(62,new Pair<>(33,58)));
        NAMap.add(new Pair<>(63,new Pair<>(34,57)));
        NAMap.add(new Pair<>(64,new Pair<>(34,57)));
        NAMap.add(new Pair<>(65,new Pair<>(35,56)));
        NAMap.add(new Pair<>(66,new Pair<>(36,54)));
        NAMap.add(new Pair<>(67,new Pair<>(37,54)));
        NAMap.add(new Pair<>(68,new Pair<>(37,51)));
        //florida
        NAMap.add(new Pair<>(68,new Pair<>(53,55)));
        NAMap.add(new Pair<>(69,new Pair<>(53,55)));
        NAMap.add(new Pair<>(70,new Pair<>(54,55)));
        NAMap.add(new Pair<>(69,new Pair<>(38,46)));
        NAMap.add(new Pair<>(70,new Pair<>(39,46)));
        NAMap.add(new Pair<>(71,new Pair<>(39,46)));
        NAMap.add(new Pair<>(72,new Pair<>(41,46)));
        //cuba
        NAMap.add(new Pair<>(72,new Pair<>(53,56)));
        NAMap.add(new Pair<>(73,new Pair<>(55,58)));
        //hawaii
        NAMap.add(new Pair<>(73,new Pair<>(15,17)));
        NAMap.add(new Pair<>(74,new Pair<>(16,18)));
        NAMap.add(new Pair<>(74,new Pair<>(57,61)));
        NAMap.add(new Pair<>(73,new Pair<>(42,46)));
        NAMap.add(new Pair<>(74,new Pair<>(42,51)));
        NAMap.add(new Pair<>(75,new Pair<>(44,51)));
        NAMap.add(new Pair<>(76,new Pair<>(45,51)));
        NAMap.add(new Pair<>(77,new Pair<>(49,53)));
        NAMap.add(new Pair<>(78,new Pair<>(51,53)));
        NAMap.add(new Pair<>(79,new Pair<>(52,53)));
        NAMap.add(new Pair<>(80,new Pair<>(52,54)));
        NAMap.add(new Pair<>(81,new Pair<>(53,57)));
        for (Pair<Integer, Pair<Integer, Integer>> location : NAMap){
            for (int i = location.getValue().getKey(); i < location.getValue().getValue(); i++) {
                blocks[i][location.getKey()].setContinent(NORTH_AMERICA);
            }
        }
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

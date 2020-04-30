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

    private Continent continent = new Continent(blocks);
    private VirusManager virusManager = new VirusManager(this);

    public void activateBlocks() {
        for (int i = 0; i < WORLD_X ; i++) {
            for (int j = 0; j < WORLD_Y ; j++) {
                blocks[i][j] = new Block("Unassigned",i,j);
            }
        }
        setNorthAmericaBlocks();
        setSouthAmericaBlocks();
        setAfricaBlocks();
        setAustraliaBlocks();
        setEuropeBlocks();
        setWaterBlocks();
        setAsiaBlocks();
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

    private void setSouthAmericaBlocks(){
        //list of a pair of a y coordinate with 2 x coordinates which makes a line
        ArrayList<Pair<Integer, Pair<Integer, Integer>>> SAMap = new ArrayList<>();
        //mainland coordinates
        SAMap.add(new Pair<>(79,new Pair<>(58,61)));
        SAMap.add(new Pair<>(80,new Pair<>(57,64)));
        SAMap.add(new Pair<>(81,new Pair<>(57,65)));
        SAMap.add(new Pair<>(82,new Pair<>(56,66)));
        SAMap.add(new Pair<>(83,new Pair<>(56,69)));
        SAMap.add(new Pair<>(84,new Pair<>(56,69)));
        SAMap.add(new Pair<>(85,new Pair<>(55,69)));
        SAMap.add(new Pair<>(86,new Pair<>(54,70)));
        SAMap.add(new Pair<>(87,new Pair<>(54,74)));
        SAMap.add(new Pair<>(88,new Pair<>(54,76)));
        SAMap.add(new Pair<>(89,new Pair<>(54,78)));
        SAMap.add(new Pair<>(90,new Pair<>(55,77)));
        SAMap.add(new Pair<>(91,new Pair<>(56,77)));
        SAMap.add(new Pair<>(92,new Pair<>(56,76)));
        SAMap.add(new Pair<>(93,new Pair<>(56,76)));
        SAMap.add(new Pair<>(94,new Pair<>(57,76)));
        SAMap.add(new Pair<>(95,new Pair<>(57,76)));
        SAMap.add(new Pair<>(96,new Pair<>(59,75)));
        SAMap.add(new Pair<>(97,new Pair<>(60,75)));
        SAMap.add(new Pair<>(98,new Pair<>(60,75)));
        SAMap.add(new Pair<>(99,new Pair<>(60,74)));
        SAMap.add(new Pair<>(100,new Pair<>(60,73)));
        SAMap.add(new Pair<>(101,new Pair<>(60,71)));
        SAMap.add(new Pair<>(102,new Pair<>(59,71)));
        SAMap.add(new Pair<>(103,new Pair<>(59,70)));
        SAMap.add(new Pair<>(104,new Pair<>(59,70)));
        SAMap.add(new Pair<>(105,new Pair<>(59,69)));
        SAMap.add(new Pair<>(106,new Pair<>(59,69)));
        SAMap.add(new Pair<>(107,new Pair<>(59,68)));
        SAMap.add(new Pair<>(108,new Pair<>(58,67)));
        SAMap.add(new Pair<>(109,new Pair<>(58,66)));
        SAMap.add(new Pair<>(110,new Pair<>(58,65)));
        SAMap.add(new Pair<>(111,new Pair<>(58,64)));
        SAMap.add(new Pair<>(112,new Pair<>(58,63)));
        SAMap.add(new Pair<>(113,new Pair<>(58,63)));
        SAMap.add(new Pair<>(114,new Pair<>(58,63)));
        SAMap.add(new Pair<>(115,new Pair<>(57,62)));
        SAMap.add(new Pair<>(116,new Pair<>(57,62)));
        SAMap.add(new Pair<>(117,new Pair<>(57,61)));
        SAMap.add(new Pair<>(118,new Pair<>(57,61)));
        SAMap.add(new Pair<>(119,new Pair<>(57,61)));
        //falkland
        SAMap.add(new Pair<>(119,new Pair<>(65,67)));
        SAMap.add(new Pair<>(120,new Pair<>(58,61)));
        SAMap.add(new Pair<>(121,new Pair<>(58,62)));
        SAMap.add(new Pair<>(122,new Pair<>(60,62)));
        for (Pair<Integer, Pair<Integer, Integer>> location : SAMap){
            for (int i = location.getValue().getKey(); i < location.getValue().getValue(); i++) {
                blocks[i][location.getKey()].setContinent(SOUTH_AMERICA);
            }
        }
    }

    private void setAfricaBlocks(){
        //list of a pair of a y coordinate with 2 x coordinates which makes a line
        ArrayList<Pair<Integer, Pair<Integer, Integer>>> AMap = new ArrayList<>();
        //mainland coordinates
        AMap.add(new Pair<>(63,new Pair<>(95,100)));
        AMap.add(new Pair<>(64,new Pair<>(91,100)));
        AMap.add(new Pair<>(65,new Pair<>(91,100)));
        AMap.add(new Pair<>(66,new Pair<>(90,102)));
        AMap.add(new Pair<>(67,new Pair<>(90,103)));
        //upper east
        AMap.add(new Pair<>(66,new Pair<>(104,106)));
        AMap.add(new Pair<>(67,new Pair<>(104,110)));
        //main
        AMap.add(new Pair<>(68,new Pair<>(90,110)));
        AMap.add(new Pair<>(69,new Pair<>(88,111)));
        AMap.add(new Pair<>(70,new Pair<>(87,111)));
        AMap.add(new Pair<>(71,new Pair<>(87,112)));
        AMap.add(new Pair<>(72,new Pair<>(86,112)));
        AMap.add(new Pair<>(73,new Pair<>(86,113)));
        AMap.add(new Pair<>(74,new Pair<>(86,113)));
        AMap.add(new Pair<>(75,new Pair<>(86,113)));
        AMap.add(new Pair<>(76,new Pair<>(86,114)));
        AMap.add(new Pair<>(77,new Pair<>(86,114)));
        AMap.add(new Pair<>(78,new Pair<>(86,115)));
        AMap.add(new Pair<>(79,new Pair<>(86,120)));
        AMap.add(new Pair<>(80,new Pair<>(88,120)));
        AMap.add(new Pair<>(81,new Pair<>(88,119)));
        AMap.add(new Pair<>(82,new Pair<>(89,119)));
        AMap.add(new Pair<>(83,new Pair<>(97,118)));
        AMap.add(new Pair<>(84,new Pair<>(99,117)));
        AMap.add(new Pair<>(85,new Pair<>(99,116)));
        AMap.add(new Pair<>(86,new Pair<>(99,115)));
        AMap.add(new Pair<>(87,new Pair<>(99,115)));
        AMap.add(new Pair<>(88,new Pair<>(100,114)));
        AMap.add(new Pair<>(89,new Pair<>(100,114)));
        AMap.add(new Pair<>(90,new Pair<>(100,114)));
        AMap.add(new Pair<>(91,new Pair<>(101,114)));
        AMap.add(new Pair<>(92,new Pair<>(101,115)));
        AMap.add(new Pair<>(93,new Pair<>(101,115)));
        AMap.add(new Pair<>(94,new Pair<>(100,115)));
        AMap.add(new Pair<>(95,new Pair<>(100,114)));
        AMap.add(new Pair<>(96,new Pair<>(100,113)));
        AMap.add(new Pair<>(97,new Pair<>(100,112)));
        AMap.add(new Pair<>(98,new Pair<>(100,112)));
        AMap.add(new Pair<>(99,new Pair<>(101,112)));
        AMap.add(new Pair<>(100,new Pair<>(101,112)));
        AMap.add(new Pair<>(101,new Pair<>(101,111)));
        AMap.add(new Pair<>(102,new Pair<>(101,111)));
        AMap.add(new Pair<>(103,new Pair<>(102,110)));
        AMap.add(new Pair<>(104,new Pair<>(102,110)));
        AMap.add(new Pair<>(105,new Pair<>(103,109)));
        AMap.add(new Pair<>(106,new Pair<>(103,108)));
        //madagascar
        AMap.add(new Pair<>(93,new Pair<>(118,119)));
        AMap.add(new Pair<>(94,new Pair<>(117,119)));
        AMap.add(new Pair<>(95,new Pair<>(117,119)));
        AMap.add(new Pair<>(96,new Pair<>(116,119)));
        AMap.add(new Pair<>(97,new Pair<>(116,119)));
        AMap.add(new Pair<>(98,new Pair<>(115,119)));
        AMap.add(new Pair<>(99,new Pair<>(115,118)));
        AMap.add(new Pair<>(100,new Pair<>(115,118)));
        for (Pair<Integer, Pair<Integer, Integer>> location : AMap){
            for (int i = location.getValue().getKey(); i < location.getValue().getValue(); i++) {
                blocks[i][location.getKey()].setContinent(AFRICA);
            }
        }
    }

    public void setAustraliaBlocks(){
        //list of a pair of a y coordinate with 2 x coordinates which makes a line
        ArrayList<Pair<Integer, Pair<Integer, Integer>>> AUMap = new ArrayList<>();
        //mainland coordinates
        AUMap.add(new Pair<>(93,new Pair<>(159,162)));
        AUMap.add(new Pair<>(94,new Pair<>(156,162)));

        AUMap.add(new Pair<>(95,new Pair<>(155,162)));
        AUMap.add(new Pair<>(96,new Pair<>(155,167)));
        AUMap.add(new Pair<>(97,new Pair<>(154,167)));
        AUMap.add(new Pair<>(98,new Pair<>(151,168)));
        AUMap.add(new Pair<>(99,new Pair<>(150,168)));
        AUMap.add(new Pair<>(100,new Pair<>(150,169)));
        AUMap.add(new Pair<>(101,new Pair<>(150,170)));
        AUMap.add(new Pair<>(102,new Pair<>(151,170)));
        AUMap.add(new Pair<>(103,new Pair<>(151,170)));
        AUMap.add(new Pair<>(104,new Pair<>(151,170)));
        AUMap.add(new Pair<>(105,new Pair<>(161,169)));
        AUMap.add(new Pair<>(106,new Pair<>(162,169)));
        AUMap.add(new Pair<>(107,new Pair<>(163,169)));
        AUMap.add(new Pair<>(108,new Pair<>(163,169)));
        AUMap.add(new Pair<>(109,new Pair<>(164,168)));
        //south-west Australia tip
        AUMap.add(new Pair<>(105,new Pair<>(151,157)));
        AUMap.add(new Pair<>(106,new Pair<>(151,156)));
        //North-east Australia tip
        AUMap.add(new Pair<>(92,new Pair<>(164,165)));
        AUMap.add(new Pair<>(93,new Pair<>(164,165)));
        AUMap.add(new Pair<>(94,new Pair<>(164,166)));
        AUMap.add(new Pair<>(95,new Pair<>(164,166)));
        //island coordinates
        AUMap.add(new Pair<>(111,new Pair<>(166,168)));
        AUMap.add(new Pair<>(112,new Pair<>(166,167)));
        //New Zealand
        AUMap.add(new Pair<>(107,new Pair<>(180,181)));
        AUMap.add(new Pair<>(108,new Pair<>(180,181)));
        AUMap.add(new Pair<>(109,new Pair<>(180,182)));
        AUMap.add(new Pair<>(110,new Pair<>(180,182)));
        AUMap.add(new Pair<>(111,new Pair<>(179,180)));
        AUMap.add(new Pair<>(112,new Pair<>(178,180)));
        AUMap.add(new Pair<>(113,new Pair<>(177,179)));
        AUMap.add(new Pair<>(114,new Pair<>(177,178)));
        for (Pair<Integer, Pair<Integer, Integer>> location : AUMap){
            for (int i = location.getValue().getKey(); i < location.getValue().getValue(); i++) {
                blocks[i][location.getKey()].setContinent(AUSTRALIA);
            }
        }
    }

    private void setEuropeBlocks(){
        //list of a pair of a y coordinate with 2 x coordinates which makes a line
        ArrayList<Pair<Integer, Pair<Integer, Integer>>> EUMap = new ArrayList<>();
        //scandinavia
        EUMap.add(new Pair<>(35,new Pair<>(105,109)));
        EUMap.add(new Pair<>(36,new Pair<>(103,109)));
        EUMap.add(new Pair<>(37,new Pair<>(102,111)));
        EUMap.add(new Pair<>(38,new Pair<>(102,114)));
        EUMap.add(new Pair<>(39,new Pair<>(101,114)));
        EUMap.add(new Pair<>(40,new Pair<>(100,106)));
        EUMap.add(new Pair<>(41,new Pair<>(99,105)));
        EUMap.add(new Pair<>(42,new Pair<>(98,104)));
        EUMap.add(new Pair<>(43,new Pair<>(97,103)));
        EUMap.add(new Pair<>(44,new Pair<>(97,103)));
        EUMap.add(new Pair<>(45,new Pair<>(97,103)));
        EUMap.add(new Pair<>(46,new Pair<>(97,103)));
        EUMap.add(new Pair<>(47,new Pair<>(100,103)));
        EUMap.add(new Pair<>(48,new Pair<>(100,103)));
        EUMap.add(new Pair<>(49,new Pair<>(100,102)));
        //denmark
        EUMap.add(new Pair<>(48,new Pair<>(98,99)));
        EUMap.add(new Pair<>(49,new Pair<>(98,99)));
        EUMap.add(new Pair<>(50,new Pair<>(98,100)));
        //finland
        EUMap.add(new Pair<>(40,new Pair<>(106,111)));
        EUMap.add(new Pair<>(41,new Pair<>(106,112)));
        EUMap.add(new Pair<>(42,new Pair<>(105,112)));
        EUMap.add(new Pair<>(43,new Pair<>(105,112)));
        EUMap.add(new Pair<>(44,new Pair<>(105,112)));
        EUMap.add(new Pair<>(45,new Pair<>(105,112)));
        //east and central europe
        EUMap.add(new Pair<>(46,new Pair<>(105,112)));
        EUMap.add(new Pair<>(47,new Pair<>(105,112)));
        EUMap.add(new Pair<>(48,new Pair<>(105,112)));
        EUMap.add(new Pair<>(49,new Pair<>(105,112)));
        EUMap.add(new Pair<>(50,new Pair<>(104,112)));
        EUMap.add(new Pair<>(51,new Pair<>(97,112)));
        EUMap.add(new Pair<>(52,new Pair<>(97,112)));
        EUMap.add(new Pair<>(53,new Pair<>(96,112)));
        EUMap.add(new Pair<>(54,new Pair<>(94,112)));
        EUMap.add(new Pair<>(55,new Pair<>(92,112)));
        EUMap.add(new Pair<>(56,new Pair<>(93,112)));
        //balkan states
        EUMap.add(new Pair<>(57,new Pair<>(101,109)));
        EUMap.add(new Pair<>(58,new Pair<>(102,108)));
        EUMap.add(new Pair<>(59,new Pair<>(103,108)));
        EUMap.add(new Pair<>(60,new Pair<>(104,108)));
        EUMap.add(new Pair<>(61,new Pair<>(104,106)));
        EUMap.add(new Pair<>(62,new Pair<>(105,106)));
        EUMap.add(new Pair<>(63,new Pair<>(105,106)));
        //spain and southern france
        EUMap.add(new Pair<>(57,new Pair<>(94,100)));
        EUMap.add(new Pair<>(58,new Pair<>(94,98)));
        EUMap.add(new Pair<>(59,new Pair<>(90,96)));
        EUMap.add(new Pair<>(60,new Pair<>(90,96)));
        EUMap.add(new Pair<>(61,new Pair<>(90,95)));
        EUMap.add(new Pair<>(62,new Pair<>(90,94)));
        EUMap.add(new Pair<>(63,new Pair<>(91,93)));
        //italy
        EUMap.add(new Pair<>(58,new Pair<>(99,100)));
        EUMap.add(new Pair<>(59,new Pair<>(100,101)));
        EUMap.add(new Pair<>(60,new Pair<>(101,102)));
        EUMap.add(new Pair<>(61,new Pair<>(102,103)));
        EUMap.add(new Pair<>(62,new Pair<>(100,102)));
        //iceland
        EUMap.add(new Pair<>(40,new Pair<>(83,87)));
        EUMap.add(new Pair<>(41,new Pair<>(83,88)));
        EUMap.add(new Pair<>(42,new Pair<>(84,87)));
        //great britain
        EUMap.add(new Pair<>(47,new Pair<>(92,93)));
        EUMap.add(new Pair<>(48,new Pair<>(91,94)));
        EUMap.add(new Pair<>(49,new Pair<>(92,93)));
        EUMap.add(new Pair<>(50,new Pair<>(89,94)));
        EUMap.add(new Pair<>(51,new Pair<>(89,95)));
        EUMap.add(new Pair<>(52,new Pair<>(89,95)));
        EUMap.add(new Pair<>(53,new Pair<>(92,94)));
        //northern islands (norway?)
        EUMap.add(new Pair<>(24,new Pair<>(103,108)));
        EUMap.add(new Pair<>(25,new Pair<>(100,107)));
        EUMap.add(new Pair<>(26,new Pair<>(100,106)));
        EUMap.add(new Pair<>(27,new Pair<>(101,106)));
        EUMap.add(new Pair<>(28,new Pair<>(101,103)));
        for (Pair<Integer, Pair<Integer, Integer>> location : EUMap){
            for (int i = location.getValue().getKey(); i < location.getValue().getValue(); i++) {
                blocks[i][location.getKey()].setContinent(EUROPE);
            }
        }
    }

    private void setAsiaBlocks() {
        ArrayList<Pair<Integer, Pair<Integer, Integer>>> ASIAMap = new ArrayList<>();
        //Central Russia
        ASIAMap.add(new Pair<>(28,new Pair<>(144,147)));
        ASIAMap.add(new Pair<>(29,new Pair<>(140,150)));
        ASIAMap.add(new Pair<>(30,new Pair<>(138,150)));
        ASIAMap.add(new Pair<>(31,new Pair<>(137,150)));
        ASIAMap.add(new Pair<>(32,new Pair<>(134,158)));
        ASIAMap.add(new Pair<>(33,new Pair<>(128,168)));
        ASIAMap.add(new Pair<>(34,new Pair<>(127,169)));
        ASIAMap.add(new Pair<>(35,new Pair<>(127,173)));
        ASIAMap.add(new Pair<>(36,new Pair<>(127,181)));
        ASIAMap.add(new Pair<>(37,new Pair<>(124,184)));
        ASIAMap.add(new Pair<>(38,new Pair<>(119,185)));
        ASIAMap.add(new Pair<>(39,new Pair<>(115,188)));
        ASIAMap.add(new Pair<>(40,new Pair<>(114,188)));
        ASIAMap.add(new Pair<>(41,new Pair<>(114,187)));
        ASIAMap.add(new Pair<>(42,new Pair<>(112,183)));
        ASIAMap.add(new Pair<>(43,new Pair<>(112,182)));
        ASIAMap.add(new Pair<>(44,new Pair<>(112,180)));
        ASIAMap.add(new Pair<>(45,new Pair<>(112,171)));
        ASIAMap.add(new Pair<>(46,new Pair<>(112,164)));
        ASIAMap.add(new Pair<>(47,new Pair<>(112,163)));
        ASIAMap.add(new Pair<>(48,new Pair<>(112,163)));
        ASIAMap.add(new Pair<>(49,new Pair<>(112,162)));
        ASIAMap.add(new Pair<>(50,new Pair<>(112,162)));
        ASIAMap.add(new Pair<>(51,new Pair<>(112,164)));
        ASIAMap.add(new Pair<>(52,new Pair<>(112,164)));
        ASIAMap.add(new Pair<>(53,new Pair<>(112,164)));
        ASIAMap.add(new Pair<>(54,new Pair<>(112,164)));
        ASIAMap.add(new Pair<>(55,new Pair<>(112,163)));
        ASIAMap.add(new Pair<>(56,new Pair<>(112,163)));
        ASIAMap.add(new Pair<>(57,new Pair<>(112,162)));
        ASIAMap.add(new Pair<>(58,new Pair<>(114,161)));
        ASIAMap.add(new Pair<>(59,new Pair<>(115,159)));
        ASIAMap.add(new Pair<>(60,new Pair<>(108,158)));
        ASIAMap.add(new Pair<>(61,new Pair<>(108,153)));
        ASIAMap.add(new Pair<>(62,new Pair<>(108,153)));
        ASIAMap.add(new Pair<>(63,new Pair<>(108,154)));
        ASIAMap.add(new Pair<>(64,new Pair<>(112,154)));
        ASIAMap.add(new Pair<>(65,new Pair<>(112,154)));
        ASIAMap.add(new Pair<>(66,new Pair<>(111,154)));
        ASIAMap.add(new Pair<>(67,new Pair<>(111,154)));
        ASIAMap.add(new Pair<>(68,new Pair<>(111,154)));
        ASIAMap.add(new Pair<>(69,new Pair<>(120,154)));
        ASIAMap.add(new Pair<>(70,new Pair<>(123,154)));
        ASIAMap.add(new Pair<>(71,new Pair<>(128,153)));
        ASIAMap.add(new Pair<>(72,new Pair<>(140,150)));
        ASIAMap.add(new Pair<>(73,new Pair<>(140,148)));
        ASIAMap.add(new Pair<>(74,new Pair<>(140,147)));
        ASIAMap.add(new Pair<>(75,new Pair<>(141,147)));
        ASIAMap.add(new Pair<>(76,new Pair<>(141,148)));
        ASIAMap.add(new Pair<>(77,new Pair<>(143,148)));
        ASIAMap.add(new Pair<>(78,new Pair<>(143,148)));
        ASIAMap.add(new Pair<>(79,new Pair<>(146,148)));
        //East Russia Tip
        ASIAMap.add(new Pair<>(72,new Pair<>(129,139)));
        ASIAMap.add(new Pair<>(73,new Pair<>(130,137)));
        ASIAMap.add(new Pair<>(74,new Pair<>(130,136)));
        ASIAMap.add(new Pair<>(75,new Pair<>(130,135)));
        ASIAMap.add(new Pair<>(76,new Pair<>(131,135)));
        ASIAMap.add(new Pair<>(77,new Pair<>(131,134)));
        ASIAMap.add(new Pair<>(78,new Pair<>(131,134)));
        ASIAMap.add(new Pair<>(79,new Pair<>(132,134)));
        ASIAMap.add(new Pair<>(80,new Pair<>(132,134)));
        //East-west Russia Tip
        ASIAMap.add(new Pair<>(68,new Pair<>(110,118)));
        ASIAMap.add(new Pair<>(69,new Pair<>(112,118)));
        ASIAMap.add(new Pair<>(70,new Pair<>(112,119)));
        ASIAMap.add(new Pair<>(71,new Pair<>(113,123)));
        ASIAMap.add(new Pair<>(72,new Pair<>(113,123)));
        ASIAMap.add(new Pair<>(73,new Pair<>(114,123)));
        ASIAMap.add(new Pair<>(74,new Pair<>(114,123)));
        ASIAMap.add(new Pair<>(75,new Pair<>(115,122)));
        ASIAMap.add(new Pair<>(76,new Pair<>(115,121)));
        ASIAMap.add(new Pair<>(77,new Pair<>(115,119)));
        //South Russia Tip
        ASIAMap.add(new Pair<>(44,new Pair<>(175,180)));
        ASIAMap.add(new Pair<>(45,new Pair<>(174,179)));
        ASIAMap.add(new Pair<>(46,new Pair<>(173,175)));
        ASIAMap.add(new Pair<>(47,new Pair<>(172,175)));
        ASIAMap.add(new Pair<>(48,new Pair<>(171,174)));
        ASIAMap.add(new Pair<>(49,new Pair<>(171,174)));
        ASIAMap.add(new Pair<>(50,new Pair<>(171,174)));
        ASIAMap.add(new Pair<>(51,new Pair<>(171,173)));
        ASIAMap.add(new Pair<>(52,new Pair<>(171,173)));
        //Nothern Russia Islands
        ASIAMap.add(new Pair<>(22,new Pair<>(121,126)));
        ASIAMap.add(new Pair<>(23,new Pair<>(116,126)));
        ASIAMap.add(new Pair<>(24,new Pair<>(118,124)));
        ASIAMap.add(new Pair<>(23,new Pair<>(140,142)));
        ASIAMap.add(new Pair<>(24,new Pair<>(139,143)));
        ASIAMap.add(new Pair<>(25,new Pair<>(140,146)));
        ASIAMap.add(new Pair<>(26,new Pair<>(143,147)));
        ASIAMap.add(new Pair<>(28,new Pair<>(126,129)));
        ASIAMap.add(new Pair<>(29,new Pair<>(124,128)));
        ASIAMap.add(new Pair<>(30,new Pair<>(122,125)));
        ASIAMap.add(new Pair<>(31,new Pair<>(122,123)));
        ASIAMap.add(new Pair<>(32,new Pair<>(121,122)));
        ASIAMap.add(new Pair<>(33,new Pair<>(120,122)));
        ASIAMap.add(new Pair<>(34,new Pair<>(120,122)));
        ASIAMap.add(new Pair<>(35,new Pair<>(121,122)));
        ASIAMap.add(new Pair<>(29,new Pair<>(162,165)));
        ASIAMap.add(new Pair<>(30,new Pair<>(162,169)));
        ASIAMap.add(new Pair<>(31,new Pair<>(163,166)));
        ASIAMap.add(new Pair<>(32,new Pair<>(164,165)));
        ASIAMap.add(new Pair<>(34,new Pair<>(182,185)));
        ASIAMap.add(new Pair<>(35,new Pair<>(182,185)));
        //South slim Island
        ASIAMap.add(new Pair<>(51,new Pair<>(165,166)));
        ASIAMap.add(new Pair<>(52,new Pair<>(165,166)));
        ASIAMap.add(new Pair<>(53,new Pair<>(165,166)));
        ASIAMap.add(new Pair<>(54,new Pair<>(165,166)));
        ASIAMap.add(new Pair<>(55,new Pair<>(165,166)));
        ASIAMap.add(new Pair<>(56,new Pair<>(164,165)));
        ASIAMap.add(new Pair<>(57,new Pair<>(164,169)));
        ASIAMap.add(new Pair<>(58,new Pair<>(164,167)));
        ASIAMap.add(new Pair<>(59,new Pair<>(163,166)));
        ASIAMap.add(new Pair<>(60,new Pair<>(163,165)));
        ASIAMap.add(new Pair<>(61,new Pair<>(163,165)));
        ASIAMap.add(new Pair<>(62,new Pair<>(163,165)));
        ASIAMap.add(new Pair<>(63,new Pair<>(161,164)));
        ASIAMap.add(new Pair<>(64,new Pair<>(159,164)));
        ASIAMap.add(new Pair<>(65,new Pair<>(158,162)));
        ASIAMap.add(new Pair<>(66,new Pair<>(158,160)));
        ASIAMap.add(new Pair<>(61,new Pair<>(156,158)));
        ASIAMap.add(new Pair<>(62,new Pair<>(156,158)));
        ASIAMap.add(new Pair<>(63,new Pair<>(156,158)));
        ASIAMap.add(new Pair<>(64,new Pair<>(156,158)));
        //Philipines
        ASIAMap.add(new Pair<>(80,new Pair<>(143,144)));
        ASIAMap.add(new Pair<>(81,new Pair<>(143,144)));
        ASIAMap.add(new Pair<>(82,new Pair<>(141,145)));
        ASIAMap.add(new Pair<>(83,new Pair<>(141,145)));
        ASIAMap.add(new Pair<>(84,new Pair<>(142,145)));
        ASIAMap.add(new Pair<>(85,new Pair<>(143,146)));
        ASIAMap.add(new Pair<>(86,new Pair<>(143,146)));
        ASIAMap.add(new Pair<>(87,new Pair<>(144,147)));
        ASIAMap.add(new Pair<>(88,new Pair<>(145,147)));
        ASIAMap.add(new Pair<>(75,new Pair<>(153,155)));
        ASIAMap.add(new Pair<>(76,new Pair<>(153,155)));
        ASIAMap.add(new Pair<>(77,new Pair<>(153,155)));
        ASIAMap.add(new Pair<>(78,new Pair<>(153,157)));
        ASIAMap.add(new Pair<>(79,new Pair<>(154,157)));
        ASIAMap.add(new Pair<>(80,new Pair<>(154,157)));
        ASIAMap.add(new Pair<>(81,new Pair<>(154,157)));
        ASIAMap.add(new Pair<>(82,new Pair<>(151,157)));
        ASIAMap.add(new Pair<>(83,new Pair<>(150,152)));
        ASIAMap.add(new Pair<>(84,new Pair<>(149,160)));
        ASIAMap.add(new Pair<>(85,new Pair<>(148,160)));
        ASIAMap.add(new Pair<>(86,new Pair<>(148,162)));
        ASIAMap.add(new Pair<>(87,new Pair<>(148,165)));
        ASIAMap.add(new Pair<>(88,new Pair<>(153,155)));
        ASIAMap.add(new Pair<>(89,new Pair<>(147,151)));
        ASIAMap.add(new Pair<>(90,new Pair<>(147,157)));
        ASIAMap.add(new Pair<>(91,new Pair<>(153,158)));
        ASIAMap.add(new Pair<>(88,new Pair<>(160,170)));
        ASIAMap.add(new Pair<>(89,new Pair<>(162,169)));
        ASIAMap.add(new Pair<>(90,new Pair<>(162,168)));
        ASIAMap.add(new Pair<>(91,new Pair<>(167,169)));

        for (Pair<Integer, Pair<Integer, Integer>> location : ASIAMap){
            for (int i = location.getValue().getKey(); i < location.getValue().getValue(); i++) {
                blocks[i][location.getKey()].setContinent(ASIA);
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
    public Continent getContinent(){
        return continent;
    }

    public VirusManager getVirusManager(){
        return virusManager;
    }

    public Block[][] getBlocks(){
        return blocks;
    }
}

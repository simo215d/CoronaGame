package project.game.logic;

public class Block {
    //we could have made enums with this if we were smarter
    public static final String NEUTRAL = "Neutral";
    public static final String INFECTED = "Infected";
    public static final String DEAD = "Dead";
    public static final String CURED = "Cured";

    private int position_x;
    private int position_y;

    private String infectionStatus;
    private String continent;

    public Block(String continent, int x, int y) {
        infectionStatus = NEUTRAL;
        this.continent = continent;
        position_x = x;
        position_y = y;
    }

    public String getInfectionStatus() {
        return infectionStatus;
    }

    public void setInfectionStatus(String infectionStatus) {
        this.infectionStatus = infectionStatus;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPosition_x(){
        return position_x;
    }

    public int getPosition_y(){
        return position_y;
    }
}

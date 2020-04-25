package project.game.logic;

public class Block {
    private int position_x;
    private int position_y;

    private String infectionStatus;
    private String continent;

    public Block(String continent, int x, int y) {
        infectionStatus = "alive";
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

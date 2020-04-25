package project.game.logic;

import javafx.stage.Stage;

public class Block {

    private String infectionStatus;
    private String continent;

    public Block(String continent) {
        infectionStatus = "alive";
        this.continent = continent;

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

}

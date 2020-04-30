package project.game.logic;

public class VirusManager {
    private int availableVirusPlacements = 3;
    private World world;

    public VirusManager(World world){
        this.world = world;
    }

    public void infectBlock(int x, int y){
        //go out if no virus placements available
        if (availableVirusPlacements<1){
            return;
        }
        world.getBlocks()[x][y].setInfectionStatus(Block.INFECTED);
        availableVirusPlacements--;
        world.render();
        System.out.println("successfully placed and rendered");
    }
}

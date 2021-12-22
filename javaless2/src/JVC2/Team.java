package JVC2;
public abstract class Team {
    private String name;
    private int maxRange;
    private int maxJump;

    public Team(String name, int maxRange, int maxJump) {
        this.maxJump = maxRange;
        this.maxRange = maxRange;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getMaxRange() {
        return maxRange;
    }

    public int getMaxJump() {
        return maxJump;
    }
    public abstract void runTreadmill(Treadmill treadmill);
    public abstract void jumpWall(Wall wall);
}

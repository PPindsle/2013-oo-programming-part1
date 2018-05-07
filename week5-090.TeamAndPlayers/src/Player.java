
/**
 *
 * @author Pernille
 */
public class Player {
    private String playerName;
    private int goals;
    
    public Player(String name) {
        this.playerName = name;
    }
    public Player(String name, int goals) {
        this.playerName = name;
        this.goals = goals;
    }
    public String getName() {
        return this.playerName;
    }
    public int goals() {
        return this.goals;
    }
    public String toString() {
        String string = "Player: " + getName() + ", goals " + goals();
        return string;
    }
    
}

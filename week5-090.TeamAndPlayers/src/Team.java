
import java.util.ArrayList;

/**
 *
 * @author Pernille
 */
public class Team {
    private String name;
    private ArrayList<Player> list = new ArrayList<Player>();
    private int maxSize = 16;
    
    public Team(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void addPlayer(Player player) {
        if (size() < this.maxSize) {
            list.add(player);
        }
    }
    public void printPlayers() {
        System.out.println(list);
    }
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    public int size() {
        int size = 0;
        for (Player player : list) {
            size++;
        }
        return size;
    }
    public int goals() {
        int goals = 0;
        for (Player player : list) {
            goals += player.goals();
        }
        return goals;
    }
    
}

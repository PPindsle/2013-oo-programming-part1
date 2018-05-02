
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top ten based on goals:");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("");
        
        System.out.println("Top 25 based on penalty amounts:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("");
        
        System.out.println("Statistics for Sidney Crosby:");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("");
        
        System.out.println("Statistics for PHI:");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        System.out.println("");
        
        System.out.println("Players in ANA by points:");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
    }
}

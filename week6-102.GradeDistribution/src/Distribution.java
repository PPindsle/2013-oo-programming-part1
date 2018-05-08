
/**
 *
 * @author Pernille
 */
import java.util.ArrayList;
public class Distribution {
    private int score;
    private int grade;
    ArrayList<Integer> scoreList;
    ArrayList<Integer> gradeList;

    public Distribution() {
        scoreList = new ArrayList<Integer>();
        gradeList = new ArrayList<Integer>();
    }
    public void addScore(int score) {
        this.score = score;
        if (score != -1) {
            scoreList.add(score);
            setGrade(this.score);
        }
    }
    
    public void getScores() {
        for (int score : scoreList) {
            System.out.println(score);
        }
    }
    public void setGrade(int scoreNumber) {
        int sn = scoreNumber;
        
        if (sn >= 0 && sn < 61) {
            if (sn > 49) {
                this.grade = 5;
            } else if (sn > 44) {
                this.grade = 4;
            } else if (sn > 39) {
                this.grade = 3;
            } else if (sn > 34) {
                this.grade = 2;
            } else if (sn > 29) {
                this.grade = 1;
            } else {
                this.grade = 0;
            }
            addGrade(this.grade);
        }
    }
    public void addGrade(int grade) {
        this.grade = grade;
        gradeList.add(grade);
    }
    public void getGrades() {
        for (int grade : gradeList) {
            System.out.println(grade);
        }
    }
    public int amountOfGrade(int gradeNum) {
        int amountOfGrade = 0;
        for (int grade : gradeList) {
            if (grade == gradeNum) {
                amountOfGrade++;
            }
        }
        return amountOfGrade;
    }
    public void getGradeDistribution() {
        int i = 5;
        String stars = "";
        
        while (i >= 0) {
            for (int j = 0; j < amountOfGrade(i); j++) {
                stars += "*";
            }
            System.out.println(i + ": " + stars);
            i--;
            stars = "";
        }
    }
    public double getPercentage() {
        int accepted = 0;
        int all = 0;
        double sum = 0;
        
        for (int grade : gradeList) {
            if (grade != 0) {
                accepted++;
            }
            all++;
        }        
        sum = 100 * accepted / (double)all;
        return sum;
    }
}

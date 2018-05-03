import java.util.ArrayList;

public class Variance {
    public static int sum(ArrayList<Integer> list) {
        int result = 0;
        for (int num : list) {
            result += num;
        }
        return result;
    }
    
    public static double average(ArrayList<Integer> list) {
        int count = 0;
        for (int num : list) {
            count++;
        }
        
        double avg = sum(list) / (double)count;
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        double sds = 0.0;
        double avg = average(list);
        for (int num : list) {
            double diff = num - avg;
            diff *= diff;
            sds += diff;
        }
        return sds / (list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}

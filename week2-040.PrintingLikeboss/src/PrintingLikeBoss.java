public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        String stars = "";
        while (amount >= 1) {
            stars += "*";
            amount--;
        }
        System.out.println(stars);
    }

    public static void printWhitespaces(int amount) {
        String space = "";
        while (amount >= 1) {
            space += " ";
            amount--;
        }
        System.out.print(space);
    }

    public static void printTriangle(int size) {
        int i = size - 1;
        int j = 1;
        while (i >= 0) {
            printWhitespaces(i);
            printStars(j);
            j++;
            i--;
        }
    }

    public static void xmasTree(int height) {
        int i = height;
        int j = height - 1;
        int y = 1;
        while (i >= 1) {
            //print the triangle
            printWhitespaces(j);
            printStars(y);
            y += 2;
            i--;
            j--;
        } 
        i = 2;
        j = height - 2;
        while (i >= 1) {
            printWhitespaces(j);
            printStars(3);
            i--;
        }
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}


import java.util.Scanner;

public class Computation {
    //set endpoints
    private static double[] setEndpoints(String lineName) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 for " + lineName + ": ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1 for " + lineName + ": ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2 for " + lineName + ": ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2 for " + lineName + ": ");
        double y2 = scanner.nextDouble();
        return new double[]{x1, y1, x2, y2};
    }
    private static boolean areEqual(double[] line1, double[] line2) {
        return line1[0] == line2[0] && line1[1] == line2[1] &&
               line1[2] == line2[2] && line1[3] == line2[3];
    }

    private static int compareLines(double[] line1, double[] line2) {
        if (areEqual(line1, line2)) {
            return 0; 
        } else if (calculateLength(line1) > calculateLength(line2)) {
            return 1;  // Line 1 is greater
        } else {
            return -1;  // Line 2 is greater
        }
    }
    //cal length
    private static double calculateLength(double[] line) {
        return Math.sqrt(Math.pow(line[2] - line[0], 2) + Math.pow(line[3] - line[1], 2));
    }

    public static void main(String[] args) {
        
        System.out.println("Welcome to Line Comparison Computation Program");
        double[] line1 = setEndpoints("Line 1");
        double[] line2 = setEndpoints("Line 2");

        if (areEqual(line1, line2)) {
            System.out.println("Lines are equal.");
        } else {
            int result = compareLines(line1, line2);

            if (result > 0) {
                System.out.println("Line 1 is greater than Line 2.");
            } else if (result < 0) {
                System.out.println("Line 2 is greater than Line 1.");
            } else {
                System.out.println("Lines are equal.");
            }
        }
    }
}

import java.util.Scanner;

public class Computation {
     private static double[] setEndpoints() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        //scanner.close();
        return new double[]{x1, y1, x2, y2};
    }
    private static boolean isEqualTo(double[] line1, double[] line2) {
        return line1[0] == line2[0] && line1[1] == line2[1] &&
               line1[2] == line2[2] && line1[3] == line2[3];
    }
    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation Program");

        System.out.println("Enter endpoints for the first line:");
        double[] line1 = setEndpoints();
        System.out.println("Enter endpoints for the second line:");
        double[] line2 = setEndpoints();
        boolean areEqual = isEqualTo(line1, line2);
        System.out.println("Lines are equal: " + areEqual);
    }
}

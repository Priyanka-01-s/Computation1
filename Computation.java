
public class Computation {
    private double[] endpoints;

    public Computation(double[] endpoints) {
        this.endpoints = endpoints;
    }

   
    public static int compare(Computation line1, Computation line2) {
        double length1 = calculateLength(line1.endpoints);
        double length2 = calculateLength(line2.endpoints);
        return Double.compare(length1, length2);
    }

    private static double calculateLength(double[] line) {
        return Math.sqrt(Math.pow(line[2] - line[0], 2) + Math.pow(line[3] - line[1], 2));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        double[] line1 = {1.0, 2.0, 4.0, 6.0};  
        double[] line2 = {9.0, 1.0, 3.0, 4.0};  

        Computation lineObj1 = new Computation(line1);
        Computation lineObj2 = new Computation(line2);

        if (lineObj1.equals(lineObj2)) {
            System.out.println("Lines are equal.");
        } else {
            int result = compare(lineObj1, lineObj2);

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

public class CompareLines {
    public static final int x1 = 3, x2 = 5, y1 = 1, y2 = 1;
    public static final int p1 = 1, p2 = 1, q1 = 1, q2 = 1;
    public static double line1, line2;

    static void CalculateLines() {
        double line1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1);
        double line2 = Math.sqrt(Math.pow(p2 - p1, 2) + Math.pow(q2 - q1, 2) * 1);
        System.out.println("length of line1 is " + line1);
        System.out.println("length of line2 is " + line2);


        if (line1 > line2) {
            System.out.println("line1 is greater ");
        } else if (line1 < line2) {
            System.out.println("line2 is greater ");

        } else

            System.out.println("both lines are equal ");

    }

    public static void main(String[] args) {
        CalculateLines();

    }
}
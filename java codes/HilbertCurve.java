public class HilbertCurve {
    static void drawHilbert(int n, int angle) {
        if (n <= 0) return;
        System.out.print("L");
        drawHilbert(n - 1, -angle);
        System.out.print("F");
        System.out.print("R");
        drawHilbert(n - 1, angle);
        System.out.print("F");
        drawHilbert(n - 1, angle);
        System.out.print("R");
        System.out.print("F");
        drawHilbert(n - 1, -angle);
        System.out.print("L");
    }

    public static void main(String[] args) {
        int order = 3;  // Order of Hilbert Curve
        System.out.println("Hilbert Curve of order " + order + ":");
        drawHilbert(order, 90);
    }
}

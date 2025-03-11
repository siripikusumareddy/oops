abstract class Pen {
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen {
    @Override
    void write() {
        System.out.println("Writing with a fountain pen...");
    }

    @Override
    void refill() {
        System.out.println("Refilling the fountain pen...");
    }

    void changeNib() {
        System.out.println("Changing the nib of the fountain pen...");
    }
}

public class PenDemo {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();
    }
}

class Room {
    double length, breadth;
    Room(double l, double b) {
        length = l;
        breadth = b;
    }
    double getArea() {
        return length * breadth;
    }
}
class VolumeRoom extends Room {
    double height;
    VolumeRoom(double l, double b, double h) {
        super(l, b);
        height = h;
    }
    double getVolume() {
        return getArea() * height; 
    }
}
public class SingleInheritanceDemo {
  public static void main(String[] args) {
        VolumeRoom room = new VolumeRoom(10, 15, 20);
        System.out.println("Area: " + room.getArea());
        System.out.println("Volume: " + room.getVolume());

class Hillstations {
    public void location() {
        System.out.println("Location is unknown.");}
    public void famousfor() {
        System.out.println("Famous for unknown attractions.");}}
class Manali extends Hillstations {
    public void location() {
        System.out.println("Location is: Manali is in Himachal Pradesh.");}
    public void famousfor() {
        System.out.println("Famous for: Hadimba Temple and adventure sports.");}}
class Mussoorie extends Hillstations {
    public void location() {
        System.out.println("Location is: Mussoorie is in Uttarakhand.");}
    public void famousfor() {
        System.out.println("Famous for: Kempty Falls and Camel's Back Road.");}}
class Gulmarg extends Hillstations }
    public void location() {
        System.out.println("Location is: Gulmarg is in Jammu & Kashmir.");    }
    public void famousfor() {
        System.out.println("Famous for: Skiing and Gondola ride.");
    }}
public class HillstationDemo {
    public static void main(String[] args) {
        Hillstations manali = new Manali();
        Hillstations mussoorie = new Mussoorie();
        Hillstations gulmarg = new Gulmarg();
        System.out.println("Manali Details:");
        manali.location();
        Manali.famousfor()
        System.out.println("\nMussoorie Details:");
        mussoorie.location();
        Mussoorie. famousfor();
        System.out.println("\nGulmarg Details:");
        gulmarg.location();
        gulmarg.famousfor();}}

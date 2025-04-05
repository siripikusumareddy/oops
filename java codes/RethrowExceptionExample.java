public class RethrowExceptionExample {

    static void level1() throws Exception {
        try {
            level2();
        } catch (Exception e) {
            System.out.println("Exception caught in level1, rethrowing...");
            throw e; // Rethrowing the same exception
        }
    }

    static void level2() throws Exception {
        try {
            level3();
        } catch (Exception e) {
            System.out.println("Exception caught in level2, rethrowing...");
            throw e; // Rethrowing the same exception
        }
    }

    static void level3() throws Exception {
        throw new Exception("Exception thrown at level3");
    }

    public static void main(String[] args) {
        try {
            level1();
        } catch (Exception e) {
            System.out.println("Exception finally handled in main: " + e.getMessage());
        }
    }
}

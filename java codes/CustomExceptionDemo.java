class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class Voter {
    void checkEligibility(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age is less than 18. You are not eligible to vote.");
        } else if (age > 120) {
            throw new AgeException("Age cannot be more than 120. Invalid input.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Voter voter = new Voter();
        try {
            voter.checkEligibility(150);
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

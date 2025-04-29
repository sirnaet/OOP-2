public class PasswordChecker {
    String correctPassword = "Steam25";
    String input;
    int attempts = 4;

    public static void main(String[] args) {
        PasswordChecker pc = new PasswordChecker();

        while (true) { 
            System.out.println("Enter password");
            pc.input = System.console().readLine();
            if (pc.input.equals(pc.correctPassword)) {
                System.out.println("Password is correct!");
                break;
            } else {
                pc.attempts--;
                System.out.println("Incorrect password. You have " + pc.attempts + " attempts left.");
                if (pc.attempts == 0) {
                    System.out.println("No attempts left. Exiting program.");
                    break;
                }
            }
        }
    }
}
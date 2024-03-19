import java.util.Scanner;
import java.util.Stack;

public class HandleComplementaryPasses {
    private Stack<ComplementaryPasses> passStack;
    private Scanner scanner;

    public HandleComplementaryPasses() {
        passStack = new Stack<>();
        scanner = new Scanner(System.in);
    }

    public void handleComplementaryPasses() {
        while (true) {
            System.out.println("Please choose an operation:");
            System.out.println("1. Redeem complementary passes");
            System.out.println("2. Display all the redeemed complementary passes");
            System.out.println("3. Display the last redeemed complementary pass");
            System.out.println("4. Undo any of the redeemed complementary pass");
            System.out.println("5. QUIT");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left in the buffer

            switch (choice) {
                case 1:
                    redeemComplementaryPasses();
                    break;
                case 2:
                    displayComplementaryPasses();
                    break;
                    case 3:
                    displayLastRedeemedComplementaryPass();
                    break;
                case 4:
                    undoRedeemedComplementaryPass();
                    break;
                case 5:
                    System.out.println("Quit");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void redeemComplementaryPasses() {
        if (passStack.size() >= 10) {
            System.out.println("Invalid operation. All the passes have been redeemed.");
            return;
        }

        System.out.print("Enter the number of passes to redeem: ");
        int numPasses = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numPasses; i++) {
            System.out.print("Enter Pass ID: ");
           String passId = scanner.next();
            scanner.nextLine(); 

            System.out.print("Enter Access Level: ");
            String accessLevel = scanner.next();
            scanner.nextLine();

            ComplementaryPasses pass = new ComplementaryPasses(passId, accessLevel);
            passStack.push(pass);
        }

        System.out.println("Passes redeemed successfully.");
    }

    private void displayComplementaryPasses() {
        if (passStack.isEmpty()) {
            System.out.println("No redeemed passes to display.");
            return;
        }

        System.out.println("Redeemed Passes:");
        for (ComplementaryPasses pass : passStack) {
            System.out.println(pass);
        }
    }

    private void displayLastRedeemedComplementaryPass() {
        if (passStack.isEmpty()) {
            System.out.println("No redeemed passes to display.");
            return;
        }

        ComplementaryPasses lastPass = passStack.peek();
        System.out.println("Last Redeemed Pass:");
        System.out.println(lastPass);
    }

    private void undoRedeemedComplementaryPass() {
        if (passStack.isEmpty()) {
            System.out.println("No redeemed passes to undo.");
            return;
        }

        System.out.print("Enter the Pass ID to undo: ");
        int passId = scanner.nextInt();
        scanner.nextLine(); 

        boolean found = false;
        Stack<ComplementaryPasses> tempStack = new Stack<>();

        while (!passStack.isEmpty()) {
            ComplementaryPasses pass = passStack.pop();
            if (pass.getPassID().equals(passId)) {
                found = true;
                System.out.println("Pass with ID " + passId + " has been undone.");
                break;
            }
            tempStack.push(pass);
        }

        if (!found) {
            System.out.println("Pass with ID " + passId + " not found.");
        }

        // Put the passes back on the stack (excluding the undone pass)
        while (!tempStack.isEmpty()) {
            passStack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        HandleComplementaryPasses handler = new HandleComplementaryPasses();
        handler.handleComplementaryPasses();
    }

    
}
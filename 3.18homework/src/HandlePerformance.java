import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HandlePerformances {
     private Queue<Performance> performances;
    private Scanner scanner;

    public HandlePerformances() {
        this.performances = new LinkedList<>();
        this.scanner = new Scanner(System.in);
    }

    public void handlePerformances() {
        int choice;
        do {
            System.out.println("Please choose an option:");
            System.out.println("1. Add performances");
            System.out.println("2. Display all the performances");
            System.out.println("3. Start the performances");
            System.out.println("4. Quit");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addPerformances();
                    break;
                case 2:
                    displayPerformances();
                    break;
                case 3:
                    startPerformance();
                    break;
                case 4:
                    System.out.println("Quitting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private void addPerformances() {
        System.out.print("Enter the number of performances to add: ");
        int numPerformances = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left in the input buffer

        for (int i = 0; i < numPerformances; i++) {
            System.out.print("Enter performance ID: ");
            String id = scanner.nextLine();
            scanner.nextLine(); // Consume the newline character left in the input buffer

            System.out.print("Enter performance name: ");
            String name = scanner.nextLine();

            System.out.print("Enter lead name: ");
            String leadName = scanner.nextLine();

            Performance performance = new Performance(id, name, leadName);
            performances.add(performance);
        }
    }

    private void displayPerformances() {
        System.out.println("All performances:");
        for (Performance performance : performances) {
            System.out.println(performance);
        }
    }

    private void startPerformance() {
        if (!performances.isEmpty()) {
            Performance firstPerformance = performances.remove();
            System.out.println("Starting performance:");
            System.out.println(firstPerformance);
        } else {
            System.out.println("No performances to start.");
        }
    }
}


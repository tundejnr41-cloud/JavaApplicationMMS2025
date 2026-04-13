import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManager {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int choice;

        do {
            // Menu
            System.out.println("\n=== TO-DO LIST MENU ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    // Add Task
                    System.out.print("Enter task: ");
                    String task = input.nextLine();
                    tasks.add(task);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    // View Tasks
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    // Delete Task
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to delete.");
                    } else {
                        System.out.println("\nSelect task number to delete:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }

                        System.out.print("Enter number: ");
                        int deleteIndex = input.nextInt();

                        if (deleteIndex > 0 && deleteIndex <= tasks.size()) {
                            tasks.remove(deleteIndex - 1);
                            System.out.println("Task deleted successfully!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        input.close();
    }
}
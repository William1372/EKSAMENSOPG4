import java.util.ArrayList;
import java.util.Scanner;

public class LaundryService {

    private ArrayList<LaundryMachine> machines;

    public LaundryService() {

        this.machines = new ArrayList<>();

    }

    public void addMachine(LaundryMachine laundryMachine) {

        machines.add(laundryMachine);

    }

    public LaundryMachine chooseMachine() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vælg ledig maskine");
        int counter = 1;

        for (LaundryMachine laundryMachine : machines) {

            System.out.println(counter + ") " + laundryMachine);
            counter++;

        }

        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= machines.size()) {

            return machines.get(choice - 1);

        } else {

            System.out.println("Forkert input..." + "(1-" + machines.size() + 1 + ")");
            return chooseMachine();

        }

    }

}

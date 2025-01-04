import java.util.Scanner;

public class WashingMachine implements LaundryMachine{

    private int duration;
    private boolean isRunning;
    private int capacity;
    private double price;

    public WashingMachine(int capacity){

        this.capacity = capacity;
        this.price = 0;

    }


    @Override
    public void chooseProgram() {

        Scanner s = new Scanner(System.in);
        System.out.println("Vælg program for din vask:");
        System.out.println("1) Uld og silke\n" +
                "2) Bomuld 40\n" +
                "3) Bomuld 60");

        int choice = s.nextInt();

        switch(choice){

            case 1:
                System.out.println("Du valgte: Uld og silke (30 min.)");
                setDuration(30);
                updateTotalDue(30);
                start();
                break;
            case 2:
                System.out.println("Du valgte: Bomuld 40 (40 min).");
                setDuration(40);
                updateTotalDue(50);
                start();
                break;
            case 3:
                System.out.println("Du valgte: Bomuld 60 (60 min.)");
                setDuration(60);
                updateTotalDue(60);
                start();
                break;
            default:
                System.out.println("Utilgængeligt valg - prøv igen (1-3)");
                chooseProgram();
                break;
        }

    }

    @Override
    public void displayPriceAndDuration() {

        System.out.println("Varighed: "+duration+" min. Pris: "+price+" kr.");

    }

    @Override
    public void start() {

        Scanner s = new Scanner(System.in);
        System.out.println("Ønsker du at tilføje forvask?");
        System.out.println("1) Ja (+5kr.)\n"+
                "2) Nej - start vask med nuværende valg");
        int choice = s.nextInt();

        switch(choice){

            case 1:
                System.out.println("Du har tilføjet forvask til din vask!");
                System.out.println("Forvask starter nu.");
                addExtra();
                isRunning = true;
                break;
            case 2:
                System.out.println("Vask uden forvask starter nu.");
                isRunning = true;
                break;
            default:
                System.out.println("Forkert input... (1-2)");
                break;

        }

    }

    public void addExtra() {

        price += 5;
        displayPriceAndDuration();

    }

    public void updateTotalDue(double weight){

        price = weight * 1.2;
        System.out.println("Total: "+price+" kr.");

    }

    public void setDuration(int duration){

        this.duration = duration;

    }

    @Override
    public String toString(){

        return "Vaskemaskine med "+capacity+" kg. kapacitet";

    }

}

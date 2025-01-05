import java.util.Scanner;

public class Dryer implements LaundryMachine{

    private int duration;
    private double price;

    public Dryer(){

        this.duration = duration;
        this.price = 0;

    }

    @Override
    public void chooseProgram() {

        Scanner s = new Scanner(System.in);
        System.out.println("Vælg program for din tørring:");
        System.out.println("1) Lav varme\n" +
                "2) Høj varme");

        int choice = Integer.parseInt(s.nextLine());

        switch(choice){

            case 1:
                System.out.println("Du valgte: Uld og silke (30 min.)");
                setDuration(30);
                updatePrice(30);
                start();
                break;
            case 2:
                System.out.println("Du valgte: Bomuld 40 (40 min).");
                setDuration(50);
                updatePrice(50);
                start();
                break;
            default:
                System.out.println("Forkert input... (1-2)");
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

        System.out.println("Tørretumbleren starter nu...");
        addExtra();

    }

    @Override
    public void addExtra() {

        Scanner s = new Scanner(System.in);
        System.out.println("Ønsker du at tilkøbe 10 min. længere tørring (+5 kr.)?");
        System.out.println("1) Ja\n"+"2) Nej\n3) Luk program");
        int choice = s.nextInt();
        switch(choice){

            case 1:
                updatePrice(duration+=10);
                System.out.println("Du har tilføjet 10 min. til tørring.");
                addExtra();
                break;
            case 2:
                System.out.println("Du har ikke tilvalgt tørring endnu - tørring fortsætter.");
                addExtra();
                break;
            case 3:
                System.out.println("Kom tilbage når dit tøj er klart om: "+duration+" min.");
                exit();
                break;
            default:
                System.out.println("Forkert input... (1-2)");
                break;

        }

    }

    public void updatePrice(int duration){

        price = duration * 0.5;
        displayPriceAndDuration();

    }

    public void setDuration(int duration){

        this.duration = duration;

    }

    @Override
    public String toString(){

        return "Tørretumbler (0,5 kr. pr. min.)";

    }

    public void exit(){

        System.exit(10);

    }

    // Til JUnit testing
    public double updatedPrice(int duration){

        return price = duration * 0.5;

    }

}

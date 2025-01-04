public class Main {

    public static void main(String[] args) {

        LaundryMachine currentMachine;

        WashingMachine wm1 = new WashingMachine(10);
        WashingMachine wm2 = new WashingMachine(20);
        WashingMachine wm3 = new WashingMachine(30);

        Dryer d1 = new Dryer();
        Dryer d2 = new Dryer();
        Dryer d3 = new Dryer();

        LaundryService ls = new LaundryService();

        ls.addMachine(wm1);
        ls.addMachine(wm2);
        ls.addMachine(wm3);
        ls.addMachine(d1);
        ls.addMachine(d2);
        ls.addMachine(d3);

        currentMachine = ls.chooseMachine();

        currentMachine.chooseProgram();

        // dryer.chooseProgram();
        // wm.chooseProgram();

    }

}

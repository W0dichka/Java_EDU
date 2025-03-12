package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int temp = numberToPrint;
        for(int i = 1; i < power;i++){
            temp *= numberToPrint;
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}

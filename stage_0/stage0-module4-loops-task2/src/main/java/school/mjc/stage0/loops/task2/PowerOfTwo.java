package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0;
        int two = 1;
        if(power < 0){
            System.out.println("too much power");
        }
        else{
            while (i <= power){
                System.out.println(two);
                two *= 2;
                i += 1;
            }
        }
    }
}
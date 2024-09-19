package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        System.out.println(factorial);
        for(int i = 1; i <= printToInclusive; i++){
            factorial *= i;
           System.out.println(factorial);
        }
    }
}

package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int flag = 0;
        for (int i = 2; i < printToInclusive; i++){
            for (int j = i/2; j > 1; j--){
                if (i % j == 0){
                    flag += 1;
                }
            }
            if(flag == 0){
                System.out.println(i);
            }
            flag = 0;
        }
    }
}

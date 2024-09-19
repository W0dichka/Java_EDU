package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int nine = 9;
        if(lengthOfLastNumber <= 0){
            System.out.println("0");
        }
        else{
            for(int i = 1; i <= lengthOfLastNumber; i++){
                sum += nine;
                nine = nine * 10 + 9;
            }
            System.out.println(sum);
        }
    }
}

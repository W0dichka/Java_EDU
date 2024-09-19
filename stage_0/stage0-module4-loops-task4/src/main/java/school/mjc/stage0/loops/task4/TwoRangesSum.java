package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(lastInRow < 0){
            System.out.println("last number in row is negative");
        }
        else{
            if(numberToSkip > lastInRow){
                System.out.println("number to skip is bigger then the last");
            }
            else{
                int sumTo = 0;
                int sumIn = 0;
                for(int i = 0; i <= lastInRow; i++){
                    sumIn += i;
                }
                for(int i = 0; i <= numberToSkip; i++){
                    sumTo += i;
                }
                System.out.println("skipped sum is " + sumTo);
                System.out.println("counted sum is " + (sumIn - sumTo));
            }
        }
    }
}

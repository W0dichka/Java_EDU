package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if(first > second){
            if(first > third){
                System.out.println(first);
            }
            else{
                System.out.println(third);
            }
        }
        else{
            if(second > third){
                System.out.println(second);
            }
            else{
                System.out.println(third);
            }
        }
    }
}

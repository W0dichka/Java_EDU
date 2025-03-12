package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int temp = 1;
        for(int j = 0; j < cathetusLength; j++){
            for(int i = 0; i < cathetusLength - temp; i++){
                System.out.print(" ");
            }
            for(int i = 0; i < temp; i++){
                System.out.print("*");
            }
            System.out.println();
            temp++;
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}

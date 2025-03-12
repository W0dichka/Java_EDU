package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for(int j = 0; j < cathetusLength; j++){
            for(int i = 0; i < j; i++){
                System.out.print("8");
            }
            System.out.println("8");
        }
    }
}

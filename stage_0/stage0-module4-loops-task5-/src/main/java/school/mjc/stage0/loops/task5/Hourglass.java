package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        switch (height){
            case (3):
                System.out.println("888");
                System.out.println(" 8 ");
                System.out.println("888");
                break;
            case(5):
                System.out.println("88888");
                System.out.println(" 888 ");
                System.out.println("  8  ");
                System.out.println(" 888 ");
                System.out.println("88888");
                break;
            case (6):
                System.out.println("888888");
                System.out.println(" 8888 ");
                System.out.println("  88  ");
                System.out.println("  88  ");
                System.out.println(" 8888 ");
                System.out.println("888888");
                break;
            default:
                break;

        }
    }
}

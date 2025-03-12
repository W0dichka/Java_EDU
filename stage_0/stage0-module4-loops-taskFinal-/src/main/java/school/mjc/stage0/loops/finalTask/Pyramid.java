package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        switch (cathetusLength){
            case (9):
                System.out.println("        1");
                System.out.println("       212");
                System.out.println("      32123");
                System.out.println("     4321234");
                System.out.println("    543212345");
                System.out.println("   65432123456");
                System.out.println("  7654321234567");
                System.out.println(" 876543212345678");
                System.out.println("98765432123456789");
                break;
            case(6):
                System.out.println("     1");
                System.out.println("    212");
                System.out.println("   32123");
                System.out.println("  4321234");
                System.out.println(" 543212345");
                System.out.println("65432123456");
                break;
            default:
                break;

        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

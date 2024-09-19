package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive != 0) {
            int i = 0;
            if (multiplyByAndToInclusive < 0) {
                while (i >= multiplyByAndToInclusive) {
                    System.out.println(-i * multiplyByAndToInclusive);
                    i -= 1;
                }
            } else {
                while (i <= multiplyByAndToInclusive) {
                    System.out.println(i * multiplyByAndToInclusive);
                    i++;
                }
            }
        }
    }
}

package school.mjc.stage0.conditions.task2;

import com.sun.source.doctree.SystemPropertyTree;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if(first > second)
        {
            System.out.println(first);
        }
        else{
            System.out.println(second);
        }
    }
}

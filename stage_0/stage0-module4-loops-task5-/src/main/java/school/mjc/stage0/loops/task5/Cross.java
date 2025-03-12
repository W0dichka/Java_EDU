package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
            for(int j = 0; j < sideLength; j++){
                if(j !=  sideLength / 2){
                    for(int k = 0;k < sideLength / 2; k++){
                        System.out.print(' ');
                    }
                    System.out.print('8');
                    for(int k = sideLength / 2; k < sideLength - 2; k++){
                        System.out.print(' ');
                    }
                    System.out.println(' ');
                }
                else{
                    for(int k = 1; k < sideLength; k++){
                        System.out.print('8');
                    }
                    System.out.println('8');
                }
            }
        }
}

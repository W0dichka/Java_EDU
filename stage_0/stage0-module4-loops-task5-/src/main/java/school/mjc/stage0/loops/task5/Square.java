package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
            for(int j = 0; j < sideLength; j++){
                if(j == 0 || j == sideLength-1){
                    for(int k = 1;k < sideLength; k++){
                        System.out.print('8');
                    }
                    System.out.println('8');
                }
                else{
                    System.out.print('8');
                    for(int k = 2; k < sideLength; k++){
                        System.out.print(' ');
                    }
                    System.out.println('8');
                }
            }
        }
}

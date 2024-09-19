package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 8:
            case 10:
            case 12:
                if (year >= 0){
                    System.out.println("31");
                }
                else{
                    System.out.println("invalid date");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (year >= 0){
                    System.out.println("30");
                }
                else{
                    System.out.println("invalid date");
                }
                break;
            case 2:
                if (year >= 0){
                    if (year % 4 == 0){
                        if(year % 100 == 0 && year % 400 == 0){
                            System.out.println("29");
                        }
                        else{
                            if(year % 100 != 0){
                                System.out.println("29");
                            }
                            else{
                                System.out.println("28");
                            }
                        }
                    }
                    else{
                        System.out.println("28");
                    }
                }
                else{
                    System.out.println("invalid date");
                }
                break;
            default:
                System.out.println("invalid date");
                break;
        }
    }
}

package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if((character >= 65 && character <= 90) || (character >= 97 && character <= 122)){
            if(character == 65 || character == 69 || character == 73 || character == 79){
                System.out.println("Vowel");
            }
            else{
                if(character == 97 || character == 101   || character == 105 || character == 111){
                    System.out.println("Vowel");
                }
                else{
                    System.out.println("Consonant");
                }
            }
        }
        else{
            System.out.println("wrong alphabet!");
        }
    }
}
package countingchars;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Characters {

    public void countingChars(String str) {
        str = str.toLowerCase();
        int newValue = 1;
        char[] charactersInString = str.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char i : charactersInString) {
            char newCharacter = i;
            if(Character.isLetter(newCharacter)==false){
                continue;
            }
            if (!charMap.containsKey(newCharacter)) {
                charMap.put(newCharacter, 1);
            } else {
                newValue = newValue + 1;
                charMap.put(newCharacter, newValue);
            }
        }
        for (Map.Entry<Character, Integer> letter : charMap.entrySet()) {
            System.out.println(letter.getKey() + " : " + letter.getValue());

        }
    }
    public String userInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String userstr = input.nextLine();
        return userstr;
    }

}


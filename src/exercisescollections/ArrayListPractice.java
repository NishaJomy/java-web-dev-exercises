package exercisescollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> myIntegers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(ArrayListPractice.sumEven(myIntegers));

        ArrayList<String> words = new ArrayList<>(Arrays.asList("asdfvg","hasdfg","asdfg","psdfg"));
        System.out.println("enter the word length");
         int wordl = ArrayListPractice.userInput();
        ArrayListPractice.wordCheck( words,wordl);
    }
    public static Integer sumEven(ArrayList<Integer> myIntegers){
        Integer total = 0;
        for( int Integer: myIntegers){
            if(Integer % 2 == 0) {
                total += Integer;
            }
        }
    return total;
    }
    public static void wordCheck(ArrayList<String> arr,int wordl){
        for(String str : arr){

            if(str.length() == wordl){
                System.out.println(str);
            }
        }
    }
    public static int userInput(){
        Scanner input = new Scanner(System.in);
        int wordLength = input.nextInt();
        return wordLength;
    }
}

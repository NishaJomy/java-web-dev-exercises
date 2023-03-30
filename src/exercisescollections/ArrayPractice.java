package exercisescollections;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.ArrayResult();
        arrayPractice.splitString();
    }
    public ArrayPractice(){

      }
    public void ArrayResult() {

        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for(int i = 0; i < integerArray.length; i++){
            if(integerArray[i] % 2 != 0) {
                System.out.println(integerArray[i]);
            }
        }
    }
    public void splitString(){
       String str = " I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
            String[] strArray = str.split(" ");
            System.out.println(Arrays.toString(strArray));
                String[] strSentenceArray = str.split("\\.");
                System.out.println(Arrays.toString(strSentenceArray));


    }


}

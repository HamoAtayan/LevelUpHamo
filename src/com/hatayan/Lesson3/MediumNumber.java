package com.hatayan.Lesson3;
/*3. Init eghats array unenq 1 keti nman
      hashvum enq arrayi elementneri mijin tvabanakany*/


//try to use arguments if can
public class MediumNumber {
    static int totalSum = 0;

    static int[] array = {20, 50, 404, 57, 602, 3985, 741, 3, 98, 5};

    public static void main(String[] args) {
        sumOfArrayElements();
    }


    public static void sumOfArrayElements() {
        for (int i = 0; i < array.length; i++) { //foreach is optimal solution
            totalSum += array[i];
        }
        int medumNumer = totalSum / array.length;
        System.out.println(medumNumer);
    }
}
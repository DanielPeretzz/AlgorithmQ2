package com.homework.daniel;

public class Main {
    public static void main(String[] args) {

        int [] firstArray =  {10,5,2,4,13};
        int [] secondArray =  {10,7,5,4,55};
        arrayWithoutDup(firstArray,secondArray);

    }
    static void arrayWithoutDup(int[]array1, int[]array2){
        int indexHelper = 0;
        int length1 = array1.length;
        int length2 = array2.length;
        int lengths = length1 + length2;
        int[] newArray = new int[lengths];

        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                if (array1[i] == array2[j]) {
                    break;
                }else if (j == length2 - 1){
                    newArray[indexHelper] = array1[i];
                    indexHelper++;
                }
            }
        }
        for (int i = 0; i < length2; i++) {
            for (int j = 0; j < length1 ; j++) {
                if(array2[i] == array1[j]){
                    break;
                }else if (j == length2-1){
                    newArray[indexHelper] = array2[i];
                    indexHelper++;
                }
            }
        }
        for (int i = indexHelper; i < newArray.length ; i++) {
            newArray[i] = -99;
            indexHelper++;
        }
        for (int i = 0; i < indexHelper; i++) {
            System.out.print(" " + newArray[i] + " ");
        }
    }

}

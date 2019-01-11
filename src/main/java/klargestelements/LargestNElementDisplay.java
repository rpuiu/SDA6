package klargestelements;

public class LargestNElementDisplay {

    public static void main(String[] args) {
        int[] array = new int[]{44,222,33,123213,412};
        int noOfMax= 3;

        for(int i = 0; i<noOfMax; i++){
            int max = getMax(array);
            System.out.println(max);
            array = removeElementFromArray(max, array);

        }

    }
    static int getMax(int[]array){
        int max = array[0];
        for (int elem:array){
            if (elem>max){
                max = elem;
            }
        }
        return max;
    }

    static int[] removeElementFromArray(int element, int[]oldArray){
        int[] newArray = new int[oldArray.length-1];

        int index = 0;
        for(int i = 0; i< oldArray.length; i++){
            if(element!=oldArray[i]){
                newArray[index]=oldArray[i];
                index++;
            }
        }
        return newArray;
    }
}

package codesignal;

public class AdjacentElementsProduct {

    public static void main(String[] args) {
        int[] inputArray = {-23, 4, -3, 8, -12};
        System.out.println(adjacentElementsProduct(inputArray));
    }
    static int adjacentElementsProduct(int[] inputArray) {
        int max = inputArray[0]*inputArray[1];
        for(int i=0; i< inputArray.length-1; i++){
            int product = inputArray[i] * inputArray[i + 1];
            if(product > max){
                max = product;
            }
        }
        return max;
    }
}

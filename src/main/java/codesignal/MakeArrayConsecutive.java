package codesignal;

public class MakeArrayConsecutive {
    public static void main(String[] args) {
        int[] statues = {8, 1, 0, 4, 7};
        System.out.println(makeArrayConsecutive2(statues));

    }

    static int makeArrayConsecutive2(int[] statues) {
        int[] newArray = statues;
        for (int j = 0; j <= newArray.length; j++) {
            for (int i = 1; i < newArray.length - j; i++) {
                if (newArray[i-1] > newArray[i]) {
                    int aux = newArray[i-1];
                    newArray[i-1] = newArray[i];
                    newArray[i] = aux;
                }
            }
        }
        int additionalStatues = 0;
        for (int i = 0; i < newArray.length - 1; i++) {
            int dif = newArray[i + 1] - newArray[i];
            if (dif != 1) {
                additionalStatues += dif - 1;
            }
        }
        return additionalStatues;
    }
}

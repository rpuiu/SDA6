package codesignal;

public class InterestingPoligon {

    public static void main(String[] args) {
        System.out.println(shapeArea(1));
        System.out.println(shapeArea(2));//5
        System.out.println(shapeArea(3));//13
        System.out.println(shapeArea(4));//25
        System.out.println(shapeArea(5));
    }

    static int shapeArea(int n) {
        int area = 1;
        if(n==1){
            return area;
        }
        return shapeArea(n-1) +4*(n-1);
    }

}

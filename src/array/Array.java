package array;

public class Array {
    public static void main(String[] args) {
        int[] intArr = new int[10];
        intArr[0] = 10;
        intArr[1] = 32;
        intArr[2] = 120;
        intArr[3] = 800;
        intArr[4] = 500;
        intArr[5] = 123;

        for (int j : intArr) {
            System.out.println(j);
        }
    }
}

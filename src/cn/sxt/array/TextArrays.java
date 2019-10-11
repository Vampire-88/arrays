package cn.sxt.array;

import java.util.Arrays;

public class TextArrays {
    public static void main(String[] args) {
        int[] b={15,6,32,96,45};
        System.out.println(b);
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.binarySearch(b,32));

    }
}

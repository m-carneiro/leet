import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LeetCode leetcode = new LeetCode();

        System.out.println(Arrays.toString(leetcode.plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(leetcode.plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(leetcode.plusOne(new int[]{9})));

    }
}

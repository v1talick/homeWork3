import java.lang.reflect.Array;

public class task3 {
    public static void main(String[] args) {
        int[] nums = { 14, 5, 723, 67, 1912, 800, 1862, 4};
        int[] numsLenght = new int[nums.length];
        int trigger = 0;
        for (int i = 0; i < nums.length; i++) {
            numsLenght[i] = 1;
            while (nums[i] / Math.pow(10, numsLenght[i] - 1) > 9) {
                numsLenght[i]++;
            }
        }
        int[] values;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            values = new int[numsLenght[i]];
            for (int j = 0; j < values.length; j++) {
                while (nums[i] >= Math.pow(10, values.length - 1 - j)) {
                    nums[i] -= Math.pow(10, values.length - 1 - j);
                    k++;
                }
                values[j] = k;
                k = 0;
            }
            for (int j = 0; j < values.length; j++) {
                for (int l = 0; l < values.length; l++) {
                    if (l != j && values[l] == values[j]) {
                        trigger++;
                    }
                }
            }

            if (trigger == 0) {
                for (int j = 0; j < values.length; j++) {
                    System.out.print(values[j]);
                }
                System.out.print("\n");
            }
            trigger = 0;
        }
    }
}

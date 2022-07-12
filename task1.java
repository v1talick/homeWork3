public class task1 {
    public static void main(String[] args) {
        int[] minor = { 5, 6, 3};
        int[] major = { 5, 5, 6, 3, 8, 9};

        int trigger = 0;
        for (int i = 0; i < major.length; i++) {
            if (major[i] == minor[0] && major.length >= i + minor.length) {
                for (int j = 0; j < minor.length; j++) {
                    if (major[i + j] != minor[j]) {
                        trigger++;
                    }
                }
                if (trigger == 0) {
                    System.out.println("Minor array is subsequence of major");
                }
                trigger = 0;
            }
        }
    }
}
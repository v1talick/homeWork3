public class task4 {
    public static void main(String[] args) {
        int k = 18;
        int N = 0;
        while (Math.pow(N, 2) <= k) {
            N++;
            //System.out.println(N);
        }
        for (int i = 1; i < Math.pow(N, 2); i++) {
            if (i <= k)
                System.out.print(1 + "  ");
            if (i % 5 == 0) {
                System.out.println("\n");
            }
        }
    }
}

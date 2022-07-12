public class task2 {
    public static void main(String[] args) {
        int[] nums = { 14, 5, 723, 67, 1912, 800, 1862, 4};
        int[] numsLenght = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numsLenght[i]=1;
            while(nums[i]/Math.pow(10,numsLenght[i]-1)>9){
                numsLenght[i]++;
            }
            //System.out.println(numsLenght[i]);
        }
        int maxIndex=numsLenght[0];
        for (int i = 0; i < nums.length; i++) {
            if(numsLenght[maxIndex]<=numsLenght[i]){
                maxIndex=i;
            }
        }
        System.out.println("\nThe longest number is "+nums[maxIndex] + " length:"+numsLenght[maxIndex]);

        int minIndex=numsLenght[0];
        for (int i = 0; i < nums.length; i++) {
            if(numsLenght[minIndex]>=numsLenght[i]){
                minIndex=i;
            }
        }
        System.out.println("\nThe shortest number is "+nums[minIndex] + " length:"+numsLenght[minIndex]);
    }
}

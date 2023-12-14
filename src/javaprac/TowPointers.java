package javaprac;

import java.util.Arrays;
import java.util.Date;

public class TowPointers {
    public static void main(String[] args) {
        System.out.println("new array : " + Arrays.toString(sortedSquares(new int[]{-3, -2, 4, 5, 6})));
    }

    public static int[] sortedSquares(int[] nums) {
        Date sd = new Date();
        System.out.println("Start time : "+sd.getTime());

//        int ans[]=new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            ans[i]=nums[i]*nums[i];
//        }
//        Arrays.sort(ans);

        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;

        int ans[] = new int[nums.length];

        while (i <= j) {
            int sqr1 = nums[i] * nums[i];
            int sqr2 = nums[j] * nums[j];

            if(sqr1 < sqr2){
                ans[k--]=sqr2;
                j--;
            }else {
                ans[k--]=sqr1;
                i++;
            }
        }
        Date ed = new Date();
        System.out.println("End time : "+ed.getTime());
        return ans;
    }
}

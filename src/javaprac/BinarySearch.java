package javaprac;

public class BinarySearch {

    public static void main(String[] args) {
      int a =   findTarget(new int[]{1,3,4,6,7,8,10},2);
        System.out.println("find at position : "+a);

//        int x= 1;
//        while(x == 1){
//            System.out.println("x is : "+x);
//            x--;
//        }
    }
    static int findTarget(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(low > high){
            return low;
        }else {
            return high;
        }
    }

}

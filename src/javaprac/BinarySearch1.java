package javaprac;

class VersionControl {
    static boolean isBadVersion(int n) {
        if (n == 1 || n == 2 || n == 3) {
            return true;
        }
        return false;
    }
}


public class BinarySearch1 extends VersionControl {


    public static int firstBadVersion(int n) {
        int i = 1;
        int j = n;

        while (i < j) {
            int mid = i + (j - i) / 2;
            if (isBadVersion(mid)) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int a = firstBadVersion(3);
        System.out.println("bad versions is : " + a);
    }
}

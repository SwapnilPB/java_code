package java8;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(longSubString("abbccbca"));//5-2=3
    }

    static String longSubString(String s) {
        char[] a = s.toCharArray();
        int count = 0;
        String tmp=s;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                if (a[i] == a[j]) {
                    count = j;
                  

                }
            }
        }
        return s.substring(0, count);
    }
}

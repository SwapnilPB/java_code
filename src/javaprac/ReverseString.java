package javaprac;

public class ReverseString {

    public static void main(String[] args) {
        String rev = reverseWords("Let's take LeetCode contest");
        System.out.println("reverse is : "+rev);
    }

    public static String reverseWords(String s) {
        String[] st = s.split(" ");
        StringBuilder sBuilder = new StringBuilder();
        int ct = 0;
        for (String ns : st) {
            sBuilder.append(reverseString(ns));
            if(ct < st.length-1){
                ct++;
                sBuilder.append(" ");
            }
        }
        return sBuilder.toString();
    }

    public static String reverseString(String s) {
        int i = 0;
        char[] ns = s.toCharArray();
        int j = ns.length-1;
        while (i < j) {
            char temp = ns[i];
            ns[i] = ns[j];
            ns[j] = temp;

            i++;
            j--;
        }
        return new String(ns);
    }
}

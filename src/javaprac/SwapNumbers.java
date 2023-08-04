package javaprac;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("swapping numbers");

      /* //by using temp as third number
       int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping numbers are --->");
        System.out.println("a : " + a);
        System.out.println("b : " + b);*/

        //without using third number

        a = a - b;//a = -1 as a =2 ; b =3
        b = b + a;// b = 2 as a=-1 ; b=3;
        a = b - a;//a = 3 as a = -1 ; b=2
        System.out.println("after swapping numbers are --->");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}

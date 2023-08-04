package java8;

public class Abc {
    int a;
    static int b;
    public void test(){
        System.out.println("Abc");
        a=10;
        b=15;
    }public static void testS(){
        System.out.println("Abc- testS");

    }
}
class Def extends Abc{
    int a;
    static int b;
    public void test(){
        System.out.println("Def");
        a=20;
        b=25;
    }
    public static void testS(){
        System.out.println("Def- testS");
    }
}
class Main{
    public static void main(String[] args) {
        Abc a = new Abc();
        a.test();
        Abc.testS();
        System.out.println("a.a : "+a.a);
        System.out.println("a.b : "+Abc.b);
        System.out.println("++++++++++++++++++++++");

        Abc ab = new Def();
        ab.test();
        Abc.testS();
        System.out.println("ab.a : "+ab.a);
        System.out.println("ab.b : "+Abc.b);
        System.out.println("++++++++++++++++++++++");

        Def d = new Def();
        d.test();
        Def.testS();
        System.out.println("d.a : "+d.a);
        System.out.println("d.b : "+Def.b);

        String s= "abc";
        String rev="";
        for (int i = s.length()-1; i >=0 ; i--) {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}

package java8;

@FunctionalInterface
public interface TestFuncInterface {
    int process();

    static void processStatic() {

    }

    static void processStatic(int a) {

    }

    default void sum() {

    }

    default void sum(int a) {

    }
}

class  Main1{
    public static void main(String[] args) {
        TestFuncInterface testFuncInterface = ()->11;
        System.out.println(testFuncInterface.process());
    }
}
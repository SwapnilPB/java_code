package javaprac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleJavaTest2 {
    public static void main(String[] args) {
        try {
            while (true) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter some number");
                String a = br.readLine();
                System.out.println("You Entered number " + a);
                if (a.equals("e") || a.equals("E")) {
                    System.exit(0);
                }
            }

        } catch (IOException ie) {
            ie.printStackTrace();
        }


    }
}

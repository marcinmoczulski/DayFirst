
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Pierwsza {
    public static void main(String[] args) {

        Scanner numberYour = new Scanner(System.in);
        int number;
        number = numberYour.nextInt();
        int num = 0;
        int prev = 0;
        int next = 1;


        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {

                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Ciąg fibonacciego"); // BRAK POMYSLU NA PODWOJNĄ JEDYNKĘ
        System.out.println(" ");
        System.out.print("1, "); // takie przekombinowanie

        for (int i = 1; i <= number; ) {


            //System.out.print(i + " . ");
            num = prev + next;
            prev = next;
            next = num;
            System.out.print(num + ", ");
            i = num;


        }
        System.out.println(" ");
        System.out.println("CIĄG NUMER 4");
        System.out.println(" ");
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i <= number;)
        {
            num1 = i+ num2;
            System.out.print(num1+" . ");
            i=num1;
            num2 = num2 + (num1 + 2);

        }

    }
}

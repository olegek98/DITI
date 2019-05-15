package ex05_conditional_statements;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    //Вводится целое положительное число n: 1<=n<=100:
    //Нужно:
    //Если число нечетное, вывести "Weird"
    //Если число четное и в диапазоне от 2 до 5 (включая границы), то вывести "Not Weird"
    //Если число четное и в диапазоне от 6 до 20 (включая границы), то вывести "Weird"
    //Если число четное и больше 20, то вывести "Not Weird"
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //TODO:
          if(n%2==0 )
            if(n >= 2 && n <= 5)
                System.out.println("Not Weird");
            if(n >= 6 && n <= 20)
                System.out.println("Weird");
            if(n > 20)
                System.out.println("Not Weird");
            else
                System.out.println("Weird");
        
        System.out.println("Not conditions");

        scanner.close();
    }
}

package org.example;
import java.util.Scanner;
public class Main {

    public static void main() {
        Scanner sc=new Scanner(System.in);
        int time=sc.nextInt();
        double principal=sc.nextDouble();
        double rate=sc.nextInt();
        double si=(time*principal*rate)/100;
        System.out.println("Simple Interest= " + si);
        sc.close();

    }
}

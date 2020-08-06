package com.example;

import java.util.Scanner;

public class CalculatorTwo {


    public static void main(String[] args) {
        int c, d, f, g, pr;
        double gh;

        while (true) {
            System.out.println("Ââåäèòå äâà ÷èñëà è îïåðàöèþ êîòîðóþ âû õîòèòå âûïîëíèòü (+ - * /),");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            char oper = scan.next().charAt(0);


            if (oper == '+') {
                c = a + b;
                System.out.println(" Ðåçóëüòàò ñóììû = " + c);
            } else if (oper == '-') {
                d = a - b;
                System.out.println("Ðåçóëüòàò ðàçíîñòè = " + d);
            } else if (oper == '*') {
                f = a * b;
                System.out.println("Ðåçóëüòàò óìíæåíèå = " + f);
            } else if (oper == '/') {
                g = a / b;
                gh = (double)a / b;
                pr = a % b;
                System.out.println(" Ðåçóëüòàò äðîáíîãî äåëåíèÿ = " + gh + " Ðåçóëüòàò öåëî÷èñëåííîãî äåëåíèÿ = " + g + " Îñòàòîê = " + pr);

            } else {
                System.out.println("Îøèáêà! Ïîïðîáóéòå ââåñòè åùå ðàç!");

            }

        }
    }

}



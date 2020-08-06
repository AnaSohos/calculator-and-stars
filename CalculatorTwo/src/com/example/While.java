package com.example;

import java.util.Random;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Угадайте число от 1 до 10");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		var b = new Random().nextInt(10);
		int s = 1;
		while (a != b) {

			System.out.println("Ошибка");
			s++;
			if (a < b) {
				System.out.println("Ваше число Меньше");
			} else {
				System.out.println("Ваше число Больше");
			}

			a = scan.nextInt();
			

		}

		System.out.println("Угадали");
		System.out.println("Число попыток =" + s);
	}
}

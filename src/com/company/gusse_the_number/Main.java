package com.company.gusse_the_number;

public class Main {

	public static void main(String[] args) {

		// Задать целочисленный массив, состоящий из элементов 0 и 1. Например:[1,1,0,0,1,0,1,1,0,0].
		// С помощию цикла и условия заменить 0 на 1, 1 на 0.
		System.out.println("Задание №1");
		int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
		int maxMass = mass.length;
		for (int i = 0; i < maxMass; i++) {
			mass[i] = mass[i] == 1 ? 0 : 1;
			System.out.println(mass[i] + " ");
		}
		// Задать пустой целочисленный массив размером 8.
		// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
		System.out.println("задание №2");
		int[] mass2 = new int[8];
		for (int i = 1, j = 0; i < mass2.length; i++) mass2[i] = j += 3;
		for (int x : mass2) System.out.print(x + " ");
		System.out.print("\r\n");

		// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
		// и числа меньшие 6 умножить на 2;
		System.out.println("Задание №3");
		int[] mass3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		for (int i = 0; i < mass3.length; i++) {
			if (mass3[i] < 6) mass3[i] *= 2;
			System.out.print(mass3[i] + " ");
		}
		System.out.print("\r\n");

		// Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
		// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
		System.out.println("задание №4");
		int[][] mass4 = new int[7][7];
		for (int i = 0; i < mass4.length; i++) {
			for (int j = 0, j2 = mass4[i].length; j < mass4[i].length; j++, j2--) {
				if (i == j || i == (j2 - 1)) mass4[i][j] = 1;
				System.out.print(mass4[i][j] + " ");
			}
			System.out.print("\r\n");
		}
		// Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
		System.out.println("задание №5");
		int[] mass5 = {10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
		int min = mass5[0], max = mass5[0], indMax = 0, indMin = 0;
		for (int i = 0; i < mass5.length; i++) {
			if (mass5[i] > max) {
				max = mass5[i];
				indMax = i;
			}
			if (mass5[i] < min) {
				min = mass5[i];
				indMin = i;
			}
		}
		System.out.println("Максимальный элемент находится в массиве под индексом " + indMax + " со значением  = " + max);
		System.out.println("Минимальный элемент находится в массиве под индексом " + indMin + " со значением  = " + min);
	}
}
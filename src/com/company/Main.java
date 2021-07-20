package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//	    task3();
//	    task4();
//	    task5();
//	    task2();
//	    task6();
//	    task7();
//	    task8();
//	    task1();

    }

	private static void task1() {
		System.out.println("Количество рассматриваемых банков: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		float [] nBank = new float[n];
		int temp = 0;
		for (int i=0; i< nBank.length;i++){
			nBank[i] = (float) (Math.random()*10);
		}
		for (int i=0; i<nBank.length;i++){
			if(nBank[temp]<nBank[i]){temp=i;}
		}
		System.out.printf("Самый выгодный курс в банке %d  обмен произайдет по курсу  %.2f",temp,nBank[temp] );
	}

	private static void task8() {
		System.out.println("Введите размер массива: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] array =new int[n];

		int temp = 0;
		for (int i=0; i<array.length;i++){
			array[i]= (int) (Math.random()*10);
			System.out.print(array[i]+", ");
		}
		for (int i=0; i<array.length/2;i++){
			temp = array[i];
			array[i]=array[(array.length)-i-1];
			array[(array.length)-i-1]=temp;
		}
		System.out.println();
		for (int i:
		     array) {
			System.out.print(i+", ");

		}
	}

	private static void task7() {
		int []h= new int[20];
		int []d = new int[20];
		for (int i = 0; i < h.length; i++){
			h[i]= (int) (Math.random()*10);
			d[i]= (int) (Math.random()*10);
		}
		Arrays.sort(h);
		Arrays.sort(d);


		for (int i =h.length-1; i>h.length-4;i--){
			System.out.println("Лучшие результаты: Прыжки в высоту  Прыжки в длинну");
			System.out.printf("%30d   %6d \n",h[i],d[i]);
		}
		for (int i =0; i<3;i++){
			System.out.println("Худшие результаты: Прыжки в высоту  Прыжки в длинну");
			System.out.printf("%30d   %6d \n",h[i],d[i]);
		}
	}

	private static void task6() {
		System.out.println("Введите интересующее количество месяцев: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] z =new int[n];
		int[] r =new int[n];
		int []p = new int[n];
		int income=0;
		for (int i = 0; i < r.length; i++){
			r[i]= (int) (Math.random()*10);
			p[i]= (int) (Math.random()*10);
			z[i]= p[i]-r[i];
			income+=z[i];
			System.out.printf("%5d  %5d  %5d\n", p[i],r[i],z[i]);
		}
		System.out.println("Общий доход составил: " + income);
	}

	private static void task2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размер массива: ");
		int n= scanner.nextInt();
		int [] array =new int[n];
		for (int i = 0; i < array.length; i++){
			array[i]= (int) (Math.random()*10);
		}
		for (int i = 1; i< array.length; i*=2){
			System.out.println( array[i]);
		}
	}

	private static void task5() {
		int [] array =new int[30];
		int up=0;
		int down=0;
		int from_point_A = 0;
		for (int i = 0; i < array.length; i++){
			array[i]= (int) (Math.rint(Math.random()));
		}
		for (int i:array) {
			if (i==1){
				up++;
			}else {down++;}
		}
		from_point_A = up*2-down;
		System.out.println("От точки А улитка отползла "+ (up*2 > down?"вверх":" в низ")+" на "+from_point_A+"см");
	}

	private static void task4() {
		int []array = new int[100];
		long x=1;
		for (int i=0; i< array.length;i++){
			array[i] = (int) (Math.random()*10);
		}
		for (int i:array) {
			if (i > 0) {
				if (i % 9 == 0) {
					x *= i;
				}
			}
		}
		System.out.println("произведение элементов массива целых чисел, которые кратны 9 = "+x);
	}

	private static void task3() {
		int [] array = new int[20];
		int sum = 0;
		for (int i = 0; i< array.length; i++){
		    array[i] = (int) (Math.random()*10);
	   }
		for (int x:array) {
		    if(x%2 == 0){
		        sum+=x;
		    }
		}
		System.out.printf("Сумма четных элементов массива равна %d",sum);
	}
}

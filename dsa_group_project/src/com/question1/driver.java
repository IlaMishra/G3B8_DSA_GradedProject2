package com.question1;

import java.util.Scanner;

import com.question1.floorassembly;

import java.util.LinkedList;


public class driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		floorassembly fa = new floorassembly();
		
		System.out.println("Enter the total no of floors in the building ");
		int floorCount = sc.nextInt();
		LinkedList<Integer> floorSizes  = new LinkedList<>();

		
		for(int i = 1; i <= floorCount; i++) {
			System.out.println("Enter the floor size given on day : " + i);	
			int size = sc.nextInt();
			floorSizes.add(size);
		}
		
		System.out.println("The order of construction is as follows");
		fa.assemble(floorCount, floorSizes);
		
		sc.close();
	}

}
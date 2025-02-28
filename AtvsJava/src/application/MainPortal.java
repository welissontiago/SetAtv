package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entites.Users;

public class MainPortal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Set<Users> a = new HashSet<>();
		Set<Users> b = new HashSet<>();
		Set<Users> c = new HashSet<>();
		
		System.out.println("How many students for course A? ");
		int quantityA = sc.nextInt();
		
		for(int i = 1; i <= quantityA; i++) {
			System.out.println("Enter student code: #" + i);
			Users userA = new Users(sc.nextInt());
			a.add(userA);
		}
		
		System.out.println("How many students for course B? ");
		int quantityB = sc.nextInt();
		
		for(int i = 1; i <= quantityB; i++) {
			System.out.println("Enter student code: #" + i);
			Users userB = new Users(sc.nextInt());
			b.add(userB);
		}
		
		System.out.println("How many students for course C? ");
		int quantityC = sc.nextInt();
		
		for(int i = 1; i <= quantityC; i++) {
			System.out.println("Enter student code: #" + i);
			Users userC = new Users(sc.nextInt());
			c.add(userC);
		}
		
		Set<Users> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " + total.size());
		
		sc.close();

	}
	
	

}

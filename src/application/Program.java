package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Student> set = new HashSet<>();
		
		System.out.print("How many students for course A: ");
		int courseA = sc.nextInt();		
		
		for (int i = 0; i < courseA; i++) {
			Student student = new Student(sc.nextInt());
			set.add(student);
		}
		
		System.out.print("How many students for course B: ");
		int courseB = sc.nextInt();		
		
		for (int i = 0; i < courseB; i++) {
			Student student = new Student(sc.nextInt());
			set.add(student);
		}
		
		System.out.print("How many students for course C: ");
		int courseC = sc.nextInt();		
		
		for (int i = 0; i < courseC; i++) {
			Student student = new Student(sc.nextInt());
			set.add(student);
		}
		
		System.out.println("Total students: " + set.size());
		
		
		sc.close();
	}

}

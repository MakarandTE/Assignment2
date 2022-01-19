package com.te.assignment.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(3, "mak", 13));
		arrayList.add(new Student(2, "sac", 24));
		arrayList.add(new Student(4, "mahi", 7));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("press 1 to display by id\npress 2 to display by name\npress 3 to display by marks");
		int choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			Collections.sort(arrayList, new SortById());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;
		case 2 :
			Collections.sort(arrayList, new SortByName());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;
		case 3 :
			Collections.sort(arrayList, new SortByMark());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			
      break;
		default:
			System.err.println("invalid input");
			break;
		}
	}

}

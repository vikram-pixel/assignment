package com.cms.main;

import java.util.Scanner;

import com.cms.menu.CustomerDetails;

public class CustomerManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("-------------------------------");
			System.out.println("|  CUSTOMER MANAGEMENT SYSTEM  |");
			System.out.println("-------------------------------");
			System.out.println("|  1. ADMIN                   |");
			System.out.println("|  2. CUSTOMER                |");
			System.out.println("|  3. EIXT                    |");
			System.out.println("-------------------------------");
			System.out.println("Enter Your Choice ?");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				CustomerDetails.adminMenu();
				break;
			case 2:
				CustomerDetails.customerMenu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Please select choice range 1-3 only");
			}
		}

	}




	}



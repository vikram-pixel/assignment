package com.cms.menu;

import java.util.List;
import java.util.Scanner;

import com.cms.bean.Customer;
import com.cms.daoimpl.CustomerDAOimpl;



public class CustomerDetails {
	static Scanner sc = new Scanner(System.in);
	static CustomerDAOimpl customerDAO = new CustomerDAOimpl();
 
	public static void adminMenu() {
		System.out.println("-----------------------");
		System.out.println("|   ADMIN MAIN MENU   |");
		System.out.println("-----------------------");
		System.out.println("| 1.ADD Customer       |");
		System.out.println("| 2.VIEW Customer      |");
		System.out.println("| 3.VIEW ALL Customers |");
		System.out.println("| 4.UPDATE Customer    |");
		System.out.println("| 5.DELETE Customer    |");
		System.out.println("| 6.BACK              |");
		System.out.println("-----------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			customerDAO.addCustomer();
			adminMenu();
			break;
		case 2:
			System.out.println("Enter Your customer mobile number?");
			Customer c= customerDAO.viewCustomer(sc.nextLong());
			System.out.println("NAME" + "\t" + "AGE" + "EMAIL" + "\t" + "MOBILENO");
			System.out.println("------------------------------------");
			System.out.println(c);
			adminMenu();
			break;
		case 3:
			List<Customer> Customers = customerDAO.viewAllCustomers();
			System.out.println("NAME" + "\t" + "AGE" + "EMAIL" + "\t" + "MOBILENO");
			System.out.println("------------------------------------");
			for (Customer p : Customers) {
				System.out.println(p);
			}
			adminMenu();
			break;
		case 4:
			System.out.println("Enter Updating customer mobile number ?");
			customerDAO.updateCustomer(sc.nextLong());
			adminMenu();
			break;
		case 5:
			System.out.println("Enter Deleting  mobile number ?");
			customerDAO.deleteCustomer(sc.nextLong());
			adminMenu();
			break;
		case 6:
			customerDAO.back();
			break;
		default:
			System.out.println("Please select your choice range 1-6 only");

		}
	}
	public static void customerMenu() {
		System.out.println("-----------------------");
		System.out.println("|  CUSTOMER MAIN MENU   |");
		System.out.println("-----------------------");
		System.out.println("| 1.VIEW Customer      |");
		System.out.println("| 2.VIEW ALL CustomersS |");
		System.out.println("| 3.BACK              |");
		System.out.println("-----------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			System.out.println("Enter Your Search mobile number ?");
			Customer customer = customerDAO.viewCustomer(sc.nextInt());
			System.out.println("NAME" + "\t" + "AGE" + "EMAIL" + "\t" + "MOBILENO");
			System.out.println("------------------------------------");
			System.out.println(customer);
			customerMenu();
			break;
		case 2:
			List<Customer> Customers = customerDAO.viewAllCustomers();
			System.out.println("NAME" + "\t" + "AGE"+"\t" + "EMAIL" + "\t" + "MOBILENO");
			System.out.println("------------------------------------");
			for (Customer p : Customers) {
				System.out.println(p);
			}
			customerMenu();
			break;
		case 3:
			customerDAO.back();
			break;
		default:
			System.out.println("Please select your choice range 1-3 only");

		}
	}

	

}

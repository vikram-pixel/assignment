package com.cms.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cms.bean.Customer;
import com.cms.dao.CustomerDAO;
import com.cms.main.CustomerManagement;
class CustomeravailablityException extends RuntimeException{
	public CustomeravailablityException(String msg) {
		super(msg);
	}
}

public  class CustomerDAOimpl implements CustomerDAO {
              Scanner sc=new Scanner(System.in);
              static List<Customer>Customers=new ArrayList<Customer>();
              static List<Customer>templist=new ArrayList<Customer>();
              Customer customer=null;
              @Override
 	
	public void addCustomer() {
		int i=1;
		while(i==1) {
			customer=new Customer();
			System.out.println("Enter your Name");
			customer.setName(sc.next());
			System.out.println("Enter your age");
			customer.setAge(sc.nextInt());
			System.out.println("Enter your Email");
			customer.setEmail(sc.next());
			System.out.println("Enter your mobileno");
			customer.setMobileno(sc.nextLong());
			Customers.add(customer);
			System.out.println("Do you want to add another customer then enter '1' and press any number to go back");
			
			i=sc.nextInt();
		}
		System.out.println("Customer added successfully!!!");
		
	}
	@Override

	public Customer viewCustomer(long Mobileno) {
		Customer c =new Customer();
		for(Customer c1:Customers) {
			if(c1.getMobileno()==Mobileno)
			{
				c=c1;
				break;
			}
			else {
				throw new CustomeravailablityException("THERE IS NO CUSTOMER WITH THAT NUMBER ");
			}
		}
		
		return c;
	}
	@Override

	public List<Customer> viewAllCustomers() {
		
		return Customers;
	}
	@Override

	public void updateCustomer(long Mobileno) {
		templist = new ArrayList<Customer>();
		for(Customer c2:Customers)
		{
			if(c2.getMobileno()==Mobileno)
			{
				System.out.println("Select Your Choice 1.Name 2.age  3. Email");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:System.out.println("Enter Updated Customer Name ?");
				       c2.setName(sc.next());
				       break;
				case 2:System.out.println("Enter Updated customer age ?");
				       c2.setAge(sc.nextInt());
				       break;
				case 3:System.out.println("Enter Updated customer Email ?");
				       c2.setEmail(sc.next());
				       break;
				default:System.out.println("Please select your choice range 1-3 only");       
				}
				templist.add(c2);
			}else{
				throw new CustomeravailablityException("CANT UPDATE PLEASE USE ANOTHER NUMBER ");
			}
			
		}
		Customers = new ArrayList<Customer>();
		for(Customer c3: templist ) {
			Customers.add(c3);
		}
		System.out.println("Customer is updated");
	}

	public void deleteCustomer(long Mobileno) {
		templist = new ArrayList<Customer>();
		for(Customer c2:Customers)
		{
			if(c2.getMobileno()==Mobileno)
			{
				
			}else{
				throw new CustomeravailablityException("CANT DELETE PLEASE USE ANOTHER NUMBER ");
			}
		}
		Customers = new ArrayList<Customer>();
		for(Customer p3:templist)
		{
			Customers.add(p3);
		}
		System.out.println("Successfully Customer Deleted...");
			
	}
public void back() {
		CustomerManagement.main(null);
		
	}

}

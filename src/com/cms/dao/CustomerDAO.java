package com.cms.dao;

import java.util.List;

import com.cms.bean.Customer;
public interface CustomerDAO {
	
	public  void addCustomer();
	public  Customer viewCustomer(long Mobileno);
	public  List<Customer> viewAllCustomers();
	public  void updateCustomer(long Mobileno );
	public  void  deleteCustomer(long Mobileno);
	public  void back();
}

package com.cms.bean;

public class Customer {
private String Name;
private int age;
private String Email;
private long Mobileno;

public Customer() {}
 public Customer(String Name,int age,String Email,int Mobileno) {
	 this.Name=Name;
	 this.age=age;
	 this.Email=Email;
	 this.Mobileno=Mobileno;
 }

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public long getMobileno() {
	return Mobileno;
}

public void setMobileno(long l) {
	Mobileno = l;
}
public String toString()
{
	return Name+"\t"+age+"\t"+Email+"\t"+Mobileno;
}
	
	
}

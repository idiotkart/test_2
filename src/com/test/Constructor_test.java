package com.test;

public class Constructor_test {
	
	int i;
	String j;
	
	Constructor_test(int i, String j)
	{
		this.i = i;
		this.j = j;
	}
	
	void display()
	{
		System.out.println(i+" "+j);
	}
	
	public String toString()
	{
		return (i+" "+j);
	}
	
	public static void main(String[] args) 
	{
		Constructor_test c = new Constructor_test(11,"Idiot");
		System.out.println(c);
	}

}

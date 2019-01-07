package seleniumdemo;

import java.util.Scanner;


public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj= new Scanner(System.in);
System.out.println("Enter two nos");
int a= obj.nextInt();
int b = obj.nextInt();
try
{
	int c = a/b;
	System.out.println(c);
}
catch(Exception e)
{
	System.out.println("number can not divided by zero");
}
finally {
	System.out.println("i will run");
}
}
	}



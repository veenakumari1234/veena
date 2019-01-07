package seleniumdemo;
import java.util.Scanner;
public class VeenaKumari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		String rev="";
		System.out.println("Please Enter Two Name");
		String s1 = obj.nextLine();
		String s2 = obj.nextLine();
		System.out.println("s1");
		System.out.println("s2");
		String s3 = s1.concat(s2);
		int a = s3.length();
		System.out.println("concataion of s1 and s2 are = "+s3);
		System.out.println(a);
		String s4 = s3.toUpperCase();
		System.out.println("upper case of concatination of two string:-"+s4);
		for(int i=a-1;i>=0;i--)
				rev = rev+s4.charAt(i);
		System.out.println(rev);
		
		
		
		

	}

}

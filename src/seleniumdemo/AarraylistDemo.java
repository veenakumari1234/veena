package seleniumdemo;

import java.util.ArrayList;

public class AarraylistDemo {

	public static void main(String[] args) {
		
		ArrayList obj = new ArrayList();
	obj.add("Veena")	;
	obj.add(1);
	obj.add(2.5);
	obj.add("abhay");
	System.out.println("your data are =" + obj);
	obj.remove(0);
	System.out.println(obj);
	obj.addAll(obj);
	System.out.println(obj);
obj.removeAll(obj);
System.out.println(obj);
	}

}

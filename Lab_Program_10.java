package pkg2;
import pkg3.MyPackage3;

public class Lab_Program_10 
{

	public static void main(String[] args) 
        {
		System.out.println("Package");
		MyPackage mypack1=new MyPackage();
		MyPackage2 mypack2=new MyPackage2();
		MyPackage3 mypack3=new MyPackage3();
		mypack1.display();
		mypack2.display();
		mypack3.display();
	}
}
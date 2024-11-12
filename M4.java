package pkg1;
import java.util.Scanner;
public class M4 
{
     public static String reverse(String s1)
    {
      int len1=s1.length();
      String s2="";
      for(int i=0;i<len1;i++)
      {
            s2=s2+s1.substring(len1-(i+1),len1-i);
            
      }
      System.out.println("Reversed string is:");
     return s2;
    }
     public static void main(String[] args)
     {
        String result=" " ;
        String s1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        s1=scanner.nextLine();
        result=reverse(s1);
        System.out.println(result);
        
        System.out.println(reverse("Manikanta"));
     }
    
}

import java.util.Scanner;
public class practice2
{
    public static void main(String[] args)
    {
        int n,i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        n=scanner.nextInt();
        scanner.nextLine();
        String[] usns = new String[n];
        System.out.println("Enter the USN of students:");
        for(i=0;i<n;i++)
        {
            System.out.println("USN"+(i+1)+": ");
            usns[i]=scanner.nextLine();
        }
        System.out.println("\nThe Entered USN's are:");
        for(String usn : usns)
        {
            System.out.println(usn);
        }
        scanner.close();
    }
}
import java.util.Scanner;
public class program_practice_1
{
    public static void main(String[] args)
    {
        
        int[][] matrix1=new int[3][3];
        int[][] matrix2=new int[3][3];
        int[][] matrix3=new int[3][3];
        Scanner scl=new Scanner(System.in);
        System.out.println("Enter the size of the matrix:\n");
        int n=scl.nextInt();
        System.out.println("Enter the elements of the first matrix:");        
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<n;i++)
            {
               matrix1[i][j]=scl.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix:");
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<n;i++)
            {
                matrix2[i][j]=scl.nextInt();
            }
        }
        
        for(int j=0;j<n;j++)
        {
           for(int i=0;i<n;i++)
           {
               matrix3[i][j]=matrix2[i][j]+matrix1[i][j];
           }
        }
        System.out.println("The sum of the 2 matrices are:");
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<n;i++)
            {
                System.out.println(matrix3[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
        
        
        
     
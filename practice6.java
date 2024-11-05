public class practice6
{
    public static void main(String[] args)
    {
        int i;
        String s1="Ganesh Prasad Nayak";
        int len1=s1.length();
        String s2=" ";
        for(i=0;i<len1;i++)
        {
            s2=s2+s1.substring(len1-(i+1),len1-i);
        }
        System.out.println(s2);
     }
}
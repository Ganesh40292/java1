public class practice7
{
    public static void reverse(String s1)
    {
        int i;
        String s2="";
        int len1=s1.length();
        for(i=0;i<len1;i++)
        {
            s2=s2+s1.substring(len1-(i+1),len1-i);
            
        }
    System.out.println(s2);
    }
    public static void main(String[] args)
    {
        reverse("Ganesh");
        reverse("Gautham");
        reverse("Deepak");
        reverse("Vijeth");
        reverse("Vignesh");
    }
}
    
    
        
            
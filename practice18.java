public class practice18
{
    public static String reverse(String s1)
    {
        int i;
        String s2="";
        int len1=s1.length();
        for(i=0;i<len1;i++)
        {
            s2=s2+s1.substring(len1-(i+1),len1-i);
            
        }
            return s2;
    }
    public static void main(String[] args)
    {
       String result="";
       result=reverse("Ganesh");
       System.out.println(result);
       System.out.println(reverse("Prasad"));
    }
}
    
    
        
            
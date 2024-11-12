class Box
{
    static int boxCount=0;
    double length,width,height;
    public Box(double length,double width,double height)
    {
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public static int getBoxCount()
    {
        return boxCount;
    }
    public double calcVol()
    {
        return length*width*height;
    }
   
}
public class P5
{
 public static void main(String args[])
 {
     Box box1=new Box(2,5,6);
     Box box2=new Box(2,6,7);
     System.out.println("Vol1="+box1.calcVol());
     System.out.println("Vol2="+box2.calcVol());
     
     
 }
}
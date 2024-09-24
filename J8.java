class Human
{
    public void job()
    {
        System.out.println("Working Professional");
    }
}
class Teacher extends Human
{
    public void job()
    {
        System.out.println("Teacher");
    }
}
class Doctor extends Human
{
    public void job()
    {
         System.out.println("Doctor");
    }
}
public class J8
{
    public static void main(String[]args)
    {
        Human Ganesh=new Human();
        Teacher Gautham=new Teacher();
        Doctor Deepak=new Doctor();
        Human Vignesh=new Doctor();
        Ganesh.job();
        Gautham.job();
        Deepak.job();
        Vignesh.job();
    }
}
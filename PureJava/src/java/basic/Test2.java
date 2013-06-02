package java.basic;

public class Test2
{
    static String color="ÂÌÉ«";
    public Test2(String color)
    {
         this.color+=color;
    }
    public static void main(String args[])
    {
        Test2 t1 = new Test2("»ÆÉ«");
        Test2 t2 = new Test2("ºìÉ«");
        System.out.println(t1.color);
        System.out.println(t2.color);
        System.out.println(color);
    }
} 

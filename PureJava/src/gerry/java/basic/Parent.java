package gerry.java.basic;

public class Parent {
    //1
    static int a = 1;
    public static final String aa = "######################";
    //2
    static  
     {
      a=10;
      System.out.println("parent static code");
     }
    //4
    public Parent(){
     System.out.println("Parent constructor");
       System.out.println("Parent a ="+a);
     }
    public static void main(String []args){
     
     System.out.println(aa);
     Parent c = new Child();
     }  
}

class Child extends Parent{
  
    static int a = 2;
    //3
    static {
      a=20;
      System.out.println("child static code");
     }
    public Child(){
      System.out.println("Child constructor");
     System.out.println("Child var a="+a);
     }
}
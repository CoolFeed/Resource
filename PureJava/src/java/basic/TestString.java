package java.basic;

public class TestString {

    public static void link(String a){
         a+="World";
     }
    public static void main(String []args){
        String a = "Hello";
        link(a);
         System.out.println(a);
         
        if(a == "Hello"){
        	System.out.println("a is equal to 'Hello");
        }
        
        Integer i = new Integer(20);
        Integer i2 = new Integer(20);
        
        if(i == i2){
        	System.out.println("true");
        }
        else{
        	System.out.println("false");
        }
     }
}

package com.springmicroservices.prac;

class A
{
    int i = 10;
    
    public void hello() {
    	System.out.println("From A "+i);

    }
    
}
 
class B extends A
{
    int i = 20;
    
    public void hello() {
    	System.out.println("From B "+i);
    }
    public void hi() {
    	System.out.println("Hi from class B");

    }

}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new B();
 
        //a.hello();
        a.hello();
    }
}

package com.example.sportzinteractive.javaexs;
interface Sayable{  
    void say();  
}  
public class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
    	Sayable s1 = () -> {System.out.println("saying something");};
    	s1.say();
    	
        Sayable sayable = MethodReference::someOtherMethod;  
        // Calling interface method  
        sayable.say();  
    }  
    
    
    public static void someOtherMethod() {
    	System.out.println("something else being spoken");
    }
}  
package com.example.sportzinteractive.javaexs;

public class Demo {

	public static void main(String[] args) {
		//life b4 lamdas
		MyPrinter myPrinter = new MyPrinter();
		myPrinter.print();
		
		//with lamdas
		Printable p1 = () -> {System.out.println("printing image");};
		p1.print();
		
		Salution s1 = (name) -> {System.out.println("welcome "+name);};
		s1.greet("abdul");
		//int waterf = waterFilter(20);
	}
	
	
	//val waterFilter = {level: Int -> level / 2}
	
	/*
	 * public int waterFilter(int level) { return level/2; }
	 */
}

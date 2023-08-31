package com.example.sportzinteractive.javaexs;

public class Wiring {
	
	public static void main(String[] args) {
		SwitchBoardListener sbl = new GeAppliances();
				//new HavellsAppliances(); //wiring
		
		//user clicking the switches
		sbl.switchOne();
		sbl.switchTwo();
		sbl.switchThree();
	}

}

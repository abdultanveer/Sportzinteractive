package com.example.sportzinteractive.javaexs;

public class GeAppliances implements SwitchBoardListener{

	@Override
	public void switchOne() {
		System.out.println("GE ac is on");
	}

	@Override
	public void switchTwo() {
		System.out.println("GE light is on");
		
	}

	@Override
	public void switchThree() {
		System.out.println("GE fan is on");
		
	}


}

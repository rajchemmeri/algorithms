package com.rajchemmeri.design.state;

public class YellowLight implements SignalState {
	
	SignalController system;
	
	volatile boolean isPushed = false;
	
	public YellowLight(SignalController system){
		System.out.println(" Yellow Light Initialized ");
		this.system = system;
		System.out.println(" ================================ ");
	}

	@Override
	public void changeState() {
		
		system.changeState(system.getRed());
	
	}

	@Override
	public void showLight() {
		System.out.println( " YELLOW.... ");
		changeState();
	}
	@Override
	public void pushButton() {
		this.isPushed = true;
	}
	
}

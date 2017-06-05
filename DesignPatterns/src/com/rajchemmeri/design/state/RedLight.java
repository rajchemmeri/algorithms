package com.rajchemmeri.design.state;

public class RedLight implements SignalState {
	
	SignalController system;
	
	volatile boolean isPushed = false;
	
	public RedLight(SignalController system){
		System.out.println(" Red Light Initialized ");
		this.system = system;
		System.out.println(" ================================ ");
	}

	@Override
	public void changeState() {
		system.changeState(system.getGreen());
		
	}

	@Override
	public void showLight() {
		System.out.println( " RED ");
		changeState();
	}
	@Override
	public void pushButton() {
		this.isPushed = true;
	}
}

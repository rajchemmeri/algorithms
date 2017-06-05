package com.rajchemmeri.design.state;

public class GreenLight implements SignalState {
	
	SignalController system;
	
	volatile boolean isPushed = false;
	
	public GreenLight(SignalController system){
		System.out.println(" Green Light Initialized ");
		this.system = system;
		System.out.println(" ================================ ");
	}

	@Override
	public void changeState() {
		//system.run();
		//System.out.println("Changing state to yellow");
		
		system.changeState(system.getYellow());

	}

	@Override
	public void showLight() {
		System.out.println( " GREEN.. ");
		changeState();
	}

	@Override
	public void pushButton() {
		this.isPushed = true;
	}

}

package com.rajchemmeri.design.state;

public class SignalController {
	
	SignalState green;
	SignalState yellow;
	SignalState red;
	SignalState dontwalk;
	SignalState flashinDontWalk;
	SignalState walk;
	
	SignalState state;
	
	volatile boolean isPushed = false;
	
	public SignalController(){
		green = new GreenLight(this);
		yellow = new YellowLight(this);
		red = new RedLight(this);
		
		//default
		state = green;
	}
	
	public void changeState(SignalState state) {
		
		this.state = state;
	}
	
	public void showLight() {
		state.showLight();
		
	}
	
	public void pushButton(){
		state.pushButton();
	}

	public boolean isPushed() {
		return isPushed;
	}

	public void setPushed(boolean isPushed) {
		this.isPushed = isPushed;
	}

	public SignalState getGreen() {
		return green;
	}

	public SignalState getYellow() {
		return yellow;
	}

	public SignalState getRed() {
		return red;
	}
	
	public void run() {
		 //  if(!system.isPushed){
			    try {
			    	Thread.currentThread().sleep(1000);
			    	//system.isPushed = true;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//system.isPushed = true;
				}
			//}
			//    system.changeState(system.red);
			//	system.showLight();
				
		}
	
}

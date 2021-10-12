package com.study.singleton;

public class Tesla {
	
	private int serialNumber = 20210001;
	private static Tesla instace = null;
	
	private Tesla() {
		
	}
	
	public static Tesla getInstance() {
		if(instace == null) {
			instace = new Tesla();
		}
		return instace;
	}
	
	public Car createCar(String model) {
		return new Car(serialNumber++, model, getClass().getSimpleName());
		
	}
}

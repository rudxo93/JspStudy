package com.study.singleton;

public class KIA {
	
	private int serialNumber = 20210001;
	private static KIA instace = null;
	
	private KIA() {
		
	}
	
	public static KIA getInstance() {
		if(instace == null) {
			instace = new KIA();
		}
		return instace;
	}
	
	public Car createCar(String model) {
		return new Car(serialNumber++, model, getClass().getSimpleName());
		
	}
}

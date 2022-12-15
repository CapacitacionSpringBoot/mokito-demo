package com.in28minutes.mokito.mokitodemo.business;

public class SomeBusinessImpl {
	private DataService dataservice;
	
	public SomeBusinessImpl(DataService dataService) {
		this.dataservice = dataService;
	}
	
	public  int findTheGreatestFromAllData() {
		int[] data = dataservice.retriveAllData();
		int greatestValue = Integer.MIN_VALUE;
		for(int value:data) {
			if(value > greatestValue) {
				greatestValue = value;
			}
		}
		return greatestValue;
	}
}

interface DataService {
	int[] retriveAllData();
}
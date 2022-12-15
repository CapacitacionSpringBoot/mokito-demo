package com.in28minutes.mokito.mokitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void findTheGreatestFromAllDta_basicScenario() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int findTheGreatestFromAllData = businessImpl.findTheGreatestFromAllData();
		assertEquals(25, findTheGreatestFromAllData);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retriveAllData() {
		return new int[] {25, 15, 5};
	}
	
}
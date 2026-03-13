package com.codewithben;

abstract class IAnimalFactory {
	public abstract IAnimal
	// if we cannot instantiate in later stage we will throw an exception
	getAnimalType(String type) throws Exception;

}

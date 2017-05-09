package polymorphism.methodoverridingcheckedexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass{
	
	@Override
	//public void commonMethod() throws IOException{//correct. super class method should throw same exception
												//or its super type or any runtime exception
		//public void commonMethod() throws RuntimeException{//correct.super class method should throw same exception
											//or its super type or any runtime exception
	//	public void commonMethod() throws ArithmeticException{//correct.super class method should throw same exception
				//or its super type or any runtime exception. 
		//public void commonMethod() throws ClassNotFoundException{//Compile time error.Incompatible with its super type
			//super class method should throw same exception
			//or its super type or any runtime exception. 
	//public void commonMethod() throws Exception{//Compile time error.Incompatible with its super type
										//super class method should throw same exception
										//or its super type or any runtime exception. 
	public void commonMethod() throws FileNotFoundException{
	}
	
	public void m1()throws RuntimeException {//correct. Super class method does not need to throw any exception
		
	}

}
//Note:if sub class method throws any runtime exception, super class method no need to throw any exception
//Note:if sub class method throws any checked exception, super class method should to throw
		//same exception or its super type
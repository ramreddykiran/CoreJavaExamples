package polymorphism.methodoverridingcheckedexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass{
	
	@Override
	//public void commonMethod() throws IOException{//super class method should throw same exception
												//or its super type or any runtime exception
		//public void commonMethod() throws RuntimeException{//super class method should throw same exception
											//or its super type or any runtime exception
		public void commonMethod() throws ArithmeticException{//super class method should throw same exception
				//or its super type or any runtime exception. 
	}

}
//Note:if sub class method throws any runtime exception, super class method no need to throw any exception
//Note:if sub class method throws any checked exception, super class method should to throw
		//same exception or its super type
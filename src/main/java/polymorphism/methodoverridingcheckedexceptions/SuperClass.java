package polymorphism.methodoverridingcheckedexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SuperClass {

	//public void commonMethod() throws Exception{ //possible
	//public void commonMethod() throws FileNotFoundException{// SUbclass should throw same or its sub class
	public void commonMethod() throws IOException{
	}
	public void m1(){}

}

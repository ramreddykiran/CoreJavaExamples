package polymorphism.methodoverridingcheckedexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SuperClass {

	//public void commonMethod() throws Exception{ //possible
	//public void commonMethod() throws FileNotFoundException{// not compatible with its subclass method
	public void commonMethod() throws IOException{// not compatible with its subclass method
	}

}

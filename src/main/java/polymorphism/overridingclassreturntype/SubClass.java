package polymorphism.overridingclassreturntype;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass{
	
	@Override
	//public I commonMethod(){////possible.this method can have same return type
		public A commonMethod(){//possible.this method can have subclass as return type. A is subclass of I
	//public B commonMethod(){ //Not possible. B is the dependent class of A.No parent child relation b/w I,B and A,B also
 //public C commonMethod(){//possible.this method can have the sub class as return type
	//public I commonMethod(){ //not possible . the return type is incompatible
		return null;
	}

}
//Note:if super class method return type is a class or interface,the sub class method 
   //should have same class as return type or its subclasses. 
//But sub class should not have the parent class or parent interface as return type

package polymorphism.overridingclassreturntype;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass{
	
	@Override
	//public I commonMethod(){//compile time error.same return type and subclass of A is allowed
		public A commonMethod(){//possible.this method can have subclass as return type A.
	//public B commonMethod(){ //Not possible. B is the dependent class of A.No parent child relation b/w I,B and A,B also
 //public C commonMethod(){//possible.this method can have the sub class as return type
		return null;
	}

}
/*Note:if super class method return type is a class or interface,the sub class method 
   should have same class as return type or its subclasses. 
But sub class method should not have the parent class or parent interface as return type*/

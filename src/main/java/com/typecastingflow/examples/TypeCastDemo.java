package com.typecastingflow.examples;

public class TypeCastDemo {
	//We should add the same class or its subclass as type casting. 
	//the type cast class should be b/w reference and object class (Object created class) hierarchy 
	public static void main(String[] args) {
		Parent2 p2o1 = (Parent2)new Parent3();// correct. Parent2, Parent3 are allowed.
		//Because reference is reference is Parent2 , instance is created for Parent3 
		p2o1.parent2M2();
		Parent1 p1o1 = (Parent3)new Parent3();//correct. Parent1,Parent2,Parent3 are allowed
		//Because reference is reference is Parent1 , instance is created for Parent3
		p1o1.parent1M3();
		
		//Parent2 p2o3 = (Parent1)new Parent3();//compiletime error. cast should be same class or its subclass of reference type
		//Parent2 p2o3 = (Object)new Parent3();//compiletime error. Parent class (Object) is also not supports
		
		//Parent3 p2o3 = (Parent2)new Parent3();//wrong. cast should be same class or its subclass
		
		Parent1 p1o2 = (Parent3) new Parent2();//throws runtime exception.ClasscastException.
		//we should not add super class of object type
	}

}

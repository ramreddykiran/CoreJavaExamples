package waystocreateobject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreateObjectDemo {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1,"employee1"); //type1
		System.out.println("emp1: "+emp1);
		try {
			Employee emp2 = Employee.class.newInstance(); //type2
			System.out.println("emp2: "+emp2);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		try {
			Employee emp3 = (Employee) Class.forName("waystocreateobject.Employee").newInstance(); //type3
			System.out.println("emp3: "+emp3);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Constructor<Employee> constructorEmp = Employee.class.getConstructor();
			Employee emp4 = constructorEmp.newInstance(); //type 4
			System.out.println("emp4: "+emp4);
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		Employee emp5 = emp1.clone(); // type 5
		System.out.println("emp5 -> clone of emp1: "+emp5);
		
		
		try {
			//serialization
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.obj"));
			out.writeObject(emp1);
			out.close();
			//Deserialization
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.obj"));
			Employee emp6 = (Employee) in.readObject();           //type 6
			System.out.println("emp6 -> read from emp1 "+emp6);
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Employee emp7 = (Employee) Employee.class.getClassLoader().loadClass("waystocreateobject.Employee").newInstance(); //type 7
			System.out.println("emp7 : "+emp7);
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

package singleton.classloader.example;

public class SingletonClassLoaderDemo {
	public static void main(String[] args) throws Exception{
		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2new = SingletonClass.getInstance();
		System.out.println(s1);
		System.out.println(s2new);
		s1.setMessage("s1 msg");
		System.out.println("s2 new "+s2new .getMessage());
		System.out.println("s1 new "+s1.getMessage());
		
		
	/*	SingletonClass s3 = (SingletonClass) Class.forName("singleton.classloader.example.SingletonClass").newInstance();
		//run time exception
		System.out.println(s3); 
		SingletonClass s4 =  SingletonClass.class.newInstance(); //run time exception
		System.out.println(s4);
		SingletonClass s5 = (SingletonClass) SingletonClass.class.getClassLoader().loadClass("singleton.classloader.example.SingletonClass").newInstance();
		System.out.println(s5); // runtime exception
		*/
		//throws IllegalAccessException because of private constructor
		
		//we can create multiple objects for singleton class if it implements Cloneable and override clone()
		/*
		 try {
			SingletonClass s2 = s1.clone();
			s2.setMessage("s2 msg");
			System.out.println("s2 cloning "+s2.getMessage());
			System.out.println("s1 new "+s1.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
	}

}

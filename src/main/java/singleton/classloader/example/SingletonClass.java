package singleton.classloader.example;

import java.io.Serializable;

public class SingletonClass /*implements Serializable,Cloneable*/{
	
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static SingletonClass getSingletonClass() {
		return singletonClass;
	}

	public static void setSingletonClass(SingletonClass singletonClass) {
		SingletonClass.singletonClass = singletonClass;
	}

	private static SingletonClass singletonClass = null;
	
	private SingletonClass(){}
	
	public static SingletonClass getInstance() {
		if(singletonClass == null) {
			synchronized(SingletonClass.class) {
				if(singletonClass == null) {
					singletonClass = new SingletonClass();
					
				}
			}
		}
		return singletonClass;
	}
	
	/*public SingletonClass clone() throws CloneNotSupportedException {
		return (SingletonClass)super.clone();
	}*/

}

package polymorphism.abstractinheritance;

import java.util.HashMap;
import java.util.Map;

public class MethodOverloading {

		public void m1(String i){
		System.out.println(4);
		}
		 public void m1(Integer i){
		        System.out.println(4);
		        }

		public void m1(Object i){
		System.out.println(5);
		}

		public static void main(String[] args) {
			MethodOverloading m = new MethodOverloading();
			Object o1 = null;
			Map<Integer, Integer> m1 = new HashMap<>();
			m1.put(null, 1);
			m1.put(1, 1);
			m1.put(null, 2);
			m1.put(2, 1);
			System.out.println(m1);
			
		}


}

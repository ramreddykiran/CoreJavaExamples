package inheritance.single;

public class SingleSuperClass {
	private int i  = 2;
	public String s = "Arun";
	public SingleSuperClass() {
		System.out.println("SingleSuperClass DC");
	}
	
	public SingleSuperClass(int a) {
		System.out.println("SingleSuperClass 1 DC");
	}
	public void superM1(){
		System.out.println("SingleSuperClass superM1 : i =" + i + " s="+s);
	}
	
	private void superM2(){
		System.out.println("SingleSuperClass superM2");
	}
			
	
	

}



package waystocreateobject;

import java.io.Serializable;

public class Employee implements Serializable, Cloneable {

	private int eid;
	private String ename;
	
	public Employee(){
		
	}

	public Employee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
	
	

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}

	@Override
	public Employee clone() {
		Employee emp = null;
		try{
			emp =  (Employee) super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return emp;
	}
	

}

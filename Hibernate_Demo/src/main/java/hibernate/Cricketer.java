package hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name="Cricketer_Data")
public class Cricketer {

	@Id
	//@Column(name="Jersery_No")
	private int jerseryNo;
	//@Column(name="Cricketer_Name")
	private String name;
	//@Column(name="Roles")
	private String role;
	
	public int getJerseryNo() {
		return jerseryNo;
	}
	public void setJerseryNo(int jerseryNo) {
		this.jerseryNo = jerseryNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	@Override
	public String toString() {
		return "Cricketer [jerseryNo=" + jerseryNo + ", name=" + name + ", role=" + role + "]";
	}
	
	
	
}

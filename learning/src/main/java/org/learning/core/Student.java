package org.learning.core;

public class Student {
	
	private String name;
	private Integer Id;
	
	public Student(Integer id,String name) {
		this.name=name;
		this.Id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	
	public boolean equals(Object o) {
//		System.out.println("Hello from Map");
		if(o!= null && o instanceof Student) {
			Integer Id=((Student)o).getId();
			if(Id != null && Id.equals(this.Id)) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
//		System.out.println("Hello from Map");
		return this.Id.hashCode();
//		return 9;
	}

}

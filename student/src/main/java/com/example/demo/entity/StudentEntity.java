package com.example.demo.entity;







import javax.persistence.*;


@Entity
@Table(name = "students")
public class StudentEntity {

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "department")
	private String department;
}
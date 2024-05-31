package com.ApiBatchChunk.entities;

public class Person {

	private Long id;
	private String name;
	private String lastname;
	private String createAt;
	
	public Person() {}
	
	public Person(Long id, String name, String lastname, String createAt) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.createAt = createAt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	public Long getId() {
		return id;
	}
	
	
}

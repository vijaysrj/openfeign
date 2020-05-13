package com.springboot.openfeign;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private Integer id;

	private String name;

	private Integer age;

	private Integer mobileNo;

	public Person() {

	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the mobileNo
	 */
	public Integer getMobileNo() {
		return mobileNo;
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Person(Integer id, String name, Integer age, Integer mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
	}

}
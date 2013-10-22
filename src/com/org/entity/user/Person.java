package com.org.entity.user;

/**
 * @Author:liangjilong
 * @Date:2013-10-19
 * @Version:1.0
 * @Email:liangjilong51job@qq.com
 * @Description:
 */
public class Person {
	private Integer personId; // 个人ID设置为主键
	private String name; // 用户名称
	private Short age; // 年龄

	/**
	 * 提供三个构造方法,有无参的也有参数的构造方法
	 */
	public Person() {
	}

	public Person(String name, Short age) {
		this.name = name;
		this.age = age;
	}

	public Person(Integer personId, String name, Short age) {
		this.personId = personId;
		this.name = name;
		this.age = age;
	}

	/**
	 * 封装
	 * 
	 * @return
	 */
	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getAge() {
		return age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

	/**
	 * 重写toString方法
	 */
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", personId="
				+ personId + ", getAge()=" + getAge() + ", getName()="
				+ getName() + ", getPersonId()=" + getPersonId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}

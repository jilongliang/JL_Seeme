package com.org.entity.user;

/**
 * @Author:liangjilong
 * @Date:2013-10-19
 * @Version:1.0
 * @Email:liangjilong51job@qq.com
 * @Description:
 */
public class Person {
	private Integer personId; // ����ID����Ϊ����
	private String name; // �û�����
	private Short age; // ����

	/**
	 * �ṩ�������췽��,���޲ε�Ҳ�в����Ĺ��췽��
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
	 * ��װ
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
	 * ��дtoString����
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

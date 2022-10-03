package com.sopra.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
private int personId;
private String personName;
private String personLocation;
public int getPersonId() {
	return personId;
}
public void setPersonId(int personId) {
	this.personId = personId;
}
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public String getPersonLocation() {
	return personLocation;
}
public void setPersonLocation(String personLocation) {
	this.personLocation = personLocation;
}
public Person(int personId, String personName, String personLocation) {
	super();
	this.personId = personId;
	this.personName = personName;
	this.personLocation = personLocation;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Person [personId=" + personId + ", personName=" + personName + ", personLocation=" + personLocation + "]";
}

}

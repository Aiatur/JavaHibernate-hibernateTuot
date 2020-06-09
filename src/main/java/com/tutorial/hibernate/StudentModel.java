package com.tutorial.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity /* (name="StudentTable") */ 
@Table(name="StudentTable")
public class StudentModel {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="sId")
	//@Transient //it declare it as a non collum entity
	private int sId;
	@Column(name="sName")
	private String sName;
//	private SnameModel sName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
//	public SnameModel getsName() {
//		return sName;
//	}
//	public void setsName(SnameModel sName) {
//		this.sName = sName;
//	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentModel [id=");
		builder.append(id);
		builder.append(", sId=");
		builder.append(sId);
		builder.append(", sName=");
		builder.append(sName);
		builder.append("]");
		return builder.toString();
	}

}

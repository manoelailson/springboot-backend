package com.javaguides.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name = "lugares")
private String lugares;

 @Column(name = "valores")
private String valores;
@Column(name = "promocao")
private String promocao;

	public Employee() {
	}
	
	public Employee(String lugares, String valores, String promocao) {
		super();
		this.lugares = lugares;
		this.valores = valores;
		this.promocao = promocao;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLugares() {
		return lugares;
	}
	public void setLugares(String lugares) {
		this.lugares = lugares;
	}
	public String getValores() {
		return valores;
	}
	public void setValores(String valores) {
		this.valores = valores;
	}
	public String getPromocao() {
		return promocao;
	}
	public void setPromocao(String promocao) {
		this.promocao = promocao;
	}
}

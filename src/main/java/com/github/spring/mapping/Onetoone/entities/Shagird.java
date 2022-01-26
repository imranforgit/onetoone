package com.github.spring.mapping.Onetoone.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Shagird {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String city;
	@OneToOne
	private Icard card;
	public Shagird() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shagird(int id, String name, String city,Icard card) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.card=card;
	}
	

}

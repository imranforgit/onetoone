package com.github.spring.mapping.Onetoone.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Icard {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String description;
	public Icard(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	public Icard() {
		super();
		// TODO Auto-generated constructor stub
	}

}

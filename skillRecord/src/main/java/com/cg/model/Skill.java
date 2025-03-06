package com.cg.model;

import jakarta.persistence.*;


@Entity
@Table(name="skills")
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String level;
	private String category;
	
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skill(Long id, String name, String level, String category) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.category = category;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}

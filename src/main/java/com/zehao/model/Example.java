package com.zehao.model;

public class Example {
	
	int id;
	
	String example;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	@Override
	public String toString() {
		return "Example [id=" + id + ", example=" + example + "]";
	}

}

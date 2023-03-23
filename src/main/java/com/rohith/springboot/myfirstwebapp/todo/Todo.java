package com.rohith.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class Todo {
	
	private int id;
	private String userid;
	@Size(min = 10, message = "Enter atleast 10 characters")
	private String description;
	private LocalDate targetDate;
	private boolean done;
	
	
	public Todo(int id, String userid, String description, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.userid = userid;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getTargetDate() {
		return targetDate;
	}


	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}


	public boolean isDone() {
		return done;
	}


	public void setDone(boolean done) {
		this.done = done;
	}


	@Override
	public String toString() {
		return "Todo [id=" + id + ", userid=" + userid + ", description=" + description + ", targetDate=" + targetDate
				+ ", done=" + done + "]";
	}


	


	
	
	
}

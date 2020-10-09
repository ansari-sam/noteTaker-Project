package com.entity;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="notes")
public class Note {
	@Id
	private int Id;
	private String Title;
	@Column(length = 500)
	private String Content;
	
	@Temporal(TemporalType.DATE)
	private Date AddedDate;

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Note(String title, String content, Date addedDate) {
		super();
		Id = new Random().nextInt(100000);
		Title = title;
		Content = content;
		AddedDate = addedDate;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public Date getAddedDate() {
		return AddedDate;
	}

	public void setAddedDate(Date addedDate) {
		AddedDate = addedDate;
	}
	
	
}

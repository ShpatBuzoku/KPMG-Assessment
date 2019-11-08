package net.socialNetwork;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article {
	private int id;
	private String title;
	private String body;
	private String author;
	private String published;
	private int likes;

	private DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	protected Article() {
		super();
		// TODO Auto-generated constructor stub

		Date date = new Date();
		this.published = sdf.format(date);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;// sdf.format(date);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}
}

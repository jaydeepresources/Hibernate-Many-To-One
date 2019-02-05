package com.component.mapping;

public class Comment {

	int id;
	String body;
	User user;

	public Comment() {

	}

	public Comment(int id, String body, User user) {
		this.id = id;
		this.body = body;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", body=" + body + ", user=" + user + "]";
	}

}

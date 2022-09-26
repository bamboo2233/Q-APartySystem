package com.xsy.maven.qaparty;

public class Score {

	private String id;
	private String name;
	private String userscore;
	private String time;
	
	
	
	
	@Override
	public String toString() {
		return "Score [id=" + id + ", name=" + name + ", userscore=" + userscore + ", time=" + time + "]";
	}
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Score(String id, String name, String userscore, String time) {
		super();
		this.id = id;
		this.name = name;
		this.userscore = userscore;
		this.time = time;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserscore() {
		return userscore;
	}
	public void setUserscore(String userscore) {
		this.userscore = userscore;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}

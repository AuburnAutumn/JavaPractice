package javaPracticeTaskTracker;

import java.time.LocalDateTime;

public class Task {
	
	private int id;
	private String title;
	private String description;
	private String status;
	private LocalDateTime createdDate;
	static private int currentID = 1;
	
	
	public Task(String title, String description) {
		super();
		this.title = title;
		this.description = description;
		this.id = currentID;
		//Don't think there's an auto-increment in this situation
		currentID += 1;
		this.createdDate = LocalDateTime.now();
		this.status = "To do";
	}
	
	
	
	@Override
	public String toString() {
		return "Id: " + id + ", Title: " + title + ", Description: " + description + ", Status: " + status
				+ ", Created date: " + createdDate;
	}



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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	
	
}

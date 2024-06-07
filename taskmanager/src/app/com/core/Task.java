package app.com.core;

import java.time.LocalDate;

public class Task {
	
	private static int taskId;
	static {
		taskId=0;
	}
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private Status status;
	private boolean active;
	
	public Task(String taskName, String description, LocalDate taskDate) {
		super();
		this.taskId=taskId++;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status = Status.PENDING ;
		this.active=true;
	}

	public static int getTaskId() {
		return taskId;
	}

	public static void setTaskId(int taskId) {
		Task.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", description=" + description + ", taskDate=" + taskDate + ", status="
				+ status + ", active=" + active + "]";
	}
	
	

}

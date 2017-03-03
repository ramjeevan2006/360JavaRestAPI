package com.bean;

public class Activity {
	
	public Activity(Integer id,String activityName, String activityDesc, String assignedToDept, String assignedToPerson,
			String priority, String dueDate, String status, String activityNotes) {
		super();
		this.id=id;
		this.activityName = activityName;
		this.activityDesc = activityDesc;
		this.assignedToDept = assignedToDept;
		this.assignedToPerson = assignedToPerson;
		this.priority = priority;
		this.dueDate = dueDate;
		this.status = status;
		this.activityNotes = activityNotes;
	}
	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Integer id;
	private String activityName;
	private String activityDesc;
	private String assignedToDept;
	private String assignedToPerson;
	private String priority;
	private String dueDate;
	private String status;
	private String activityNotes;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityDesc() {
		return activityDesc;
	}
	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}
	public String getAssignedToDept() {
		return assignedToDept;
	}
	public void setAssignedToDept(String assignedToDept) {
		this.assignedToDept = assignedToDept;
	}
	public String getAssignedToPerson() {
		return assignedToPerson;
	}
	public void setAssignedToPerson(String assignedToPerson) {
		this.assignedToPerson = assignedToPerson;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getActivityNotes() {
		return activityNotes;
	}
	public void setActivityNotes(String activityNotes) {
		this.activityNotes = activityNotes;
	}

}

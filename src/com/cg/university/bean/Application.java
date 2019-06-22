package com.cg.university.bean;

import java.util.Date;

public class Application {
	private int application_id;
	private String FullName;
	private Date DOB;
	private String highestQualification;
	private int marksObtained;
	private String goals;
	private String emailId;
	private String scheduledProgramId;
	private String status;
	private Date dateOfInterview;
	
	public Application(){}

	public Application(int application_id, String fullName, Date dOB,
			String highestQualification, int marksObtained, String goals,
			String emailId, String scheduledProgramId, String status,
			Date dateOfInterview) {
		super();
		this.application_id = application_id;
		FullName = fullName;
		DOB = dOB;
		this.highestQualification = highestQualification;
		this.marksObtained = marksObtained;
		this.goals = goals;
		this.emailId = emailId;
		this.scheduledProgramId = scheduledProgramId;
		this.status = status;
		this.dateOfInterview = dateOfInterview;
	}

	public int getApplication_id() {
		return application_id;
	}

	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public int getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getScheduledProgramId() {
		return scheduledProgramId;
	}

	public void setScheduledProgramId(String scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateOfInterview() {
		return dateOfInterview;
	}

	public void setDateOfInterview(Date dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}

	@Override
	public String toString() {
		return "Application [application_id=" + application_id + ", FullName="
				+ FullName + ", DOB=" + DOB + ", highestQualification="
				+ highestQualification + ", marksObtained=" + marksObtained
				+ ", goals=" + goals + ", emailId=" + emailId
				+ ", scheduledProgramId=" + scheduledProgramId + ", status="
				+ status + ", dateOfInterview=" + dateOfInterview + "]";
	}
	
	
	

}

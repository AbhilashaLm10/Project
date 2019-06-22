package com.cg.university.bean;

import java.util.Date;

public class ProgramScheduled {

	private String scheduledProgramId;
	private String ProgramName;
	private String Location;
	private Date startDate;
	private Date endDate;
	private int sessionsPerWeek;
	
	public ProgramScheduled(){}

	public ProgramScheduled(String scheduledProgramId, String programName,
			String location, Date startDate, Date endDate, int sessionsPerWeek) {
		super();
		this.scheduledProgramId = scheduledProgramId;
		ProgramName = programName;
		Location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.sessionsPerWeek = sessionsPerWeek;
	}

	public String getScheduledProgramId() {
		return scheduledProgramId;
	}

	public void setScheduledProgramId(String scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}

	public String getProgramName() {
		return ProgramName;
	}

	public void setProgramName(String programName) {
		ProgramName = programName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getSessionsPerWeek() {
		return sessionsPerWeek;
	}

	public void setSessionsPerWeek(int sessionsPerWeek) {
		this.sessionsPerWeek = sessionsPerWeek;
	}

	@Override
	public String toString() {
		return "ProgramScheduled [scheduledProgramId=" + scheduledProgramId
				+ ", ProgramName=" + ProgramName + ", Location=" + Location
				+ ", startDate=" + startDate + ", endDate=" + endDate
				+ ", sessionsPerWeek=" + sessionsPerWeek + "]";
	}
	
	
}

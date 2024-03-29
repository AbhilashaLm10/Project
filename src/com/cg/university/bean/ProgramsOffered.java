package com.cg.university.bean;

public class ProgramsOffered {
	
	private String programName;
	private String description;
	private String applicantEligibilty;
	private int duration;
	private String degreeCertificateOffered;
	
	public ProgramsOffered(){}

	public ProgramsOffered(String programName, String description,
			String applicantEligibilty, int duration,
			String degreeCertificateOffered) {
		super();
		this.programName = programName;
		this.description = description;
		this.applicantEligibilty = applicantEligibilty;
		this.duration = duration;
		this.degreeCertificateOffered = degreeCertificateOffered;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getApplicantEligibilty() {
		return applicantEligibilty;
	}

	public void setApplicantEligibilty(String applicantEligibilty) {
		this.applicantEligibilty = applicantEligibilty;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDegreeCertificateOffered() {
		return degreeCertificateOffered;
	}

	public void setDegreeCertificateOffered(String degreeCertificateOffered) {
		this.degreeCertificateOffered = degreeCertificateOffered;
	}

	@Override
	public String toString() {
		return "ProgramsOffered [programName=" + programName + ", description="
				+ description + ", applicantEligibilty=" + applicantEligibilty
				+ ", duration=" + duration + ", degreeCertificateOffered="
				+ degreeCertificateOffered + "]";
	}
	
	
	

}

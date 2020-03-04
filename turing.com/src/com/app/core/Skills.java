package com.app.core;

public class Skills {
	private Integer skillId;
	private String skillName;//select {.NET Core, .NET MVC, AngularJS, ReactJS, Java Core, Java EE, Spring Framework, etc...}
	private String competency; //select {Beginner, Intermediate, Advanced, Expert}
	private Integer experience;
	public Skills(String skillName, String competency, Integer experience) {
		super();
		this.skillName = skillName;
		this.competency = competency;
		this.experience = experience;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getCompetency() {
		return competency;
	}
	public void setCompetency(String competency) {
		this.competency = competency;
	}
	public Integer getExperience() {
		return experience;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	public Integer getSkillId() {
		return skillId;
	}
	@Override
	public String toString() {
		return "Skills [skillId=" + skillId + ", skillName=" + skillName
				+ ", competency=" + competency + ", experience=" + experience
				+ ", getSkillName()=" + getSkillName() + ", getCompetency()="
				+ getCompetency() + ", getExperience()=" + getExperience()
				+ ", getSkillId()=" + getSkillId() + "]";
	}
}

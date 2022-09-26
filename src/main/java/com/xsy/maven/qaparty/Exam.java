package com.xsy.maven.qaparty;

public class Exam {

	private String testId;
	private String testType;
	private String testTitle;
	private String optionA;
	private String optionB;
	private String optionC;
	private String testAnswer;
	
	@Override
	public String toString() {
		return "Exam [testId=" + testId + ", testType=" + testType + ", testTitle=" + testTitle + ", optionA=" + optionA
				+ ", optionB=" + optionB + ", optionC=" + optionC + ", testAnswer=" + testAnswer + "]";
	}
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam(String testId, String testType, String testTitle, String optionA, String optionB, String optionC,
			String testAnswer) {
		super();
		this.testId = testId;
		this.testType = testType;
		this.testTitle = testTitle;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.testAnswer = testAnswer;
	}
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getTestType() {
		return testType;
	}
	public void setTestType(String testType) {
		this.testType = testType;
	}
	public String getTestTitle() {
		return testTitle;
	}
	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getTestAnswer() {
		return testAnswer;
	}
	public void setTestAnswer(String testAnswer) {
		this.testAnswer = testAnswer;
	}
	
	

	
	
}

package edu.ilstu;
import java.util.Random;
public class Student {



	public Student() {
	}
	
	Random rand = new Random();
	String studentName;
	char studentType;
	int currentBrainPower;
	int currentScore;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String newStudentName) {
		studentName = newStudentName;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char newStudentType) {
		studentType = newStudentType;
	}
	public int getCurrentBrainPower() {
		return currentBrainPower;
	}
	public void setCurrentBrainPower(int newCurrentBrainPower) {
		currentBrainPower = newCurrentBrainPower;
	}
	public int setCurrentScore() {
		return currentScore;
	}
	public void getCurrentScore(int newCurrentScore) {
		currentScore = newCurrentScore;
	}
	public void study(int time) {
		if (studentType == 'g')
			this.currentBrainPower = time * 2;
		if (studentType == 'r')
			this.currentBrainPower = time * 0.75;
				
	public int answerQuestion(int answer) {
		if (studentType == 'r')
			this.answerQuestion(rand.nextInt(101));
		else if (studentType == 'g')
			this.answerQuestion(rand.nextInt(101));
	}
	public void creditForBestAnswer() {
		this.currentScore = currentScore + 1;
	}
	public Student(char studentType, String studentName) {
		this.studentType = 'g';
		this.studentType = 'r';
		this.studentName = studentName;
		
	}
}
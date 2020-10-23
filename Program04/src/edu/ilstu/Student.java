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
			this.currentBrainPower = currentBrainPower + time * 2;
		else if (studentType == 'r')
			this.currentBrainPower = (int) (currentBrainPower + time * 0.75);
	}
	public int answerQuestion(int answer) {
		if (studentType == 'r')
			//this.answerQuestion(rand.nextInt(101))
			this.currentBrainPower = currentBrainPower - 5;
		else if (studentType == 'g' && answer)
			//this.answerQuestion(rand.nextInt(101));
			this.currentBrainPower = currentBrainPower -3;
	}
	public void creditForBestAnswer() {
		this.currentScore = currentScore + 1;
	}
	public Student(char studentType, String studentName) {
		if (this.studentType = 'g')
			this.currentBrainPower = 50;
		else if (this.studentType = 'r')
			this.currentBrainPower = 30;
		this.studentName = studentName;
		
	}
}
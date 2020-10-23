package edu.ilstu;
import java.util.Random;
public class QuizBowl {

	public static void main(String[] args) {
	Student stuG = new Student();
	Student stuR = new Student();
	stuG.setCurrentBrainPower(50);
	stuR.setCurrentBrainPower(30);
	stuG.study(2);
	stuR.study(6);
	stuG.setStudentType('g');
	stuR.setStudentType('r');
	stuG.setStudentName("Dr.Califf");
	stuR.setStudentName("Jack Black");
	stuG.setCurrentScore(0);
	stuR.setCurrentScore(0);
	
	
	stuG.answerQuestion(0);
		
	
	}

	
	
}

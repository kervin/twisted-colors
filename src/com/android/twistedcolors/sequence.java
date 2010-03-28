package com.android.twistedcolors;

import java.util.ArrayList;
import java.util.Random;

import com.android.twistedcolors.colors.Colors;

//KeR: Class for sequence shown to user
public class sequence {
		
	private ArrayList<Colors> sequence;
	//stores on the number of input by the user
	private int userLevel;
	private int score;
	
	public ArrayList<Colors> getSequence() {
		return this.sequence;
	}
	
	private void setNextSequence(Colors nextColor) {
		this.sequence.add(nextColor);
	}
	
	private void generate() {
		 Random randomGenerator = new Random();
		 int randomInt = randomGenerator.nextInt(4);
		 
		 Colors nextColor = Colors.NONE;
		 nextColor.setColor(randomInt);
		 
		 setNextSequence(nextColor);
	
		 
	}
}

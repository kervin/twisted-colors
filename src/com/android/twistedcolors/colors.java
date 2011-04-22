package com.android.twistedcolors;

public class colors {

	public enum Colors {
		//TODO: Do we need NONE?
		NONE (-1),
		RED (0),
		BLUE (1),
		YELLOW (2),
		GREEN (3);
	
		private int colorValue;
		
		Colors(int val) {
			this.colorValue = val;
		}
		
		Colors() {
			this.colorValue = -1;
		}
		
		public int getColorValue() {
			return this.colorValue;
		}
		
		public void setColor(int val) {
			this.colorValue = val;
		}
	}
}

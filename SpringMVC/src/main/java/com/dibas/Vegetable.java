package com.dibas;

public class Vegetable {

	private String myName;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String talkAboutYou() {

		String speech = "Hi, I am Vegetable.";

		if (myName != null && myName != "")
			speech += " My Name is : " + myName;

		return speech;
	}

}

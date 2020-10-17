package dev;

import java.applet.Applet;

public class Main extends Applet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -34756586857418724L;

	public static void main(String[] args) {
		String sequence = "2 222 222 33 66 8 88 777 33 0 33 0 8 666 777777777777777777777777777777777";
		//sequence = "222";
		WebInterFace func = new WebInterFace();
		String result = func.stringConverter(sequence);
		System.out.println(result);
	}
}

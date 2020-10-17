package dev;

public class Main {

	public static void main(String[] args) {
		String sequence = "2 222 222 33 66 8 88 777 33 0 33 0 8 666 777777777777777777777777777777777";
		//sequence = "222";
		String result = stringConverter(sequence);
		System.out.println(result);
	}
	
	

	private static String stringConverter(String sequence) {
		String[] nums = sequence.split(" ");
		String result = "";
		for (String num : nums) {
			String character = charConverter(num);
			//System.out.println(character);
			result += character;
		}
		return result;
	}



	private static String charConverter(String num) {
		String[] char2 = {"a","b","c"};
		String[] char3 = {"d","e","f"};
		String[] char4 = {"g","h","i"};
		String[] char5 = {"j","k","l"};
		String[] char6 = {"m","n","o"};
		String[] char7 = {"p","q","r","s"};
		String[] char8 = {"t","u","v"};
		String[] char9 = {"w","x","y","z"};
		String[] char0 = {" "};
		String character = "";
		int key = takeKey(num);
		int index = num.length()-1;
		switch (key) {
		case 2:
			character = char2[index % char2.length];
			break;
		case 3:
			character = char3[index % char3.length];
			break;
		case 4:
			character = char4[index % char4.length];
			break;
		case 5:
			character = char5[index % char5.length];
			break;
		case 6:
			character = char6[index % char6.length];
			break;
		case 7:
			character = char7[index % char7.length];
			break;
		case 8:
			character = char8[index % char8.length];
			break;
		case 9:
			character = char9[index % char9.length];
			break;
		case 0:
			character = char0[index % char0.length];
			break;
		}
		return character;
	}
	
	private static int takeIndex(String num) {
		int len = num.length(); 
		return len;
	}



	private static int takeKey(String num) {
		char firstNum = num.charAt(0);
		int key = 0;
		key = Character.getNumericValue(firstNum); 			
		return key;
	}

}

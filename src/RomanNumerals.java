import java.util.*;


public class RomanNumerals {	
	
	public int convertToInteger(String romanNum) {
		
		HashMap<String, Integer> convert = new HashMap<String, Integer>();
		
		if (!checkRepetition(romanNum) || !checkSubtraction(romanNum))
			return -1;
		
		convert.put("I", 1);
		convert.put("V", 5);
		convert.put("X", 10);
		convert.put("L", 50);
		convert.put("C", 100);
		convert.put("D", 500);
		convert.put("M", 1000);
		
		int sum = 0;
		
		for(int i = 0, n = romanNum.length() ; i < n ; i++) { 
		    char c = romanNum.charAt(i);
		    sum += convert.get(String.valueOf(c));
		}

		sum -= 2 * toSubtract(romanNum);
		
		return sum;
		
	}
	
	public boolean checkRepetition(String romanNum) {
		if (romanNum.contains("IIII") || romanNum.contains("XXXX") ||
				romanNum.contains("CCCC") || romanNum.contains("MMMM")) {
			return false;
		} else if ((romanNum.indexOf("V") != romanNum.lastIndexOf("V")) ||
				(romanNum.indexOf("L") != romanNum.lastIndexOf("L")) ||
				(romanNum.indexOf("D") != romanNum.lastIndexOf("D"))) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean checkSubtraction(String romanNum) {
		if (romanNum.contains("IL") || romanNum.contains("IC") || romanNum.contains("ID") ||
				romanNum.contains("IM") || romanNum.contains("XD") || romanNum.contains("XM") ||
				romanNum.contains("VX") || romanNum.contains("VL") || romanNum.contains("VC") ||
				romanNum.contains("VD") || romanNum.contains("VM") || romanNum.contains("LC") ||
				romanNum.contains("LD") || romanNum.contains("LM") || romanNum.contains("DM")) {
					return false;
		} else {
			return true;
		}
	}
	
	public int toSubtract(String romanNum) {
		int subtract = 0;
		if (romanNum.contains("IV") || romanNum.contains("IX")) {
			subtract += 1;
		}
		if (romanNum.contains("XL") || romanNum.contains("XC")) {
			subtract += 10;
		}
		if (romanNum.contains("CD") || romanNum.contains("CM")) {
			subtract += 100;
		}
		return subtract;
	}
	
}

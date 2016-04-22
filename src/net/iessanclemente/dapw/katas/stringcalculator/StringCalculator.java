package net.iessanclemente.dapw.katas.stringcalculator;

public class StringCalculator {

	public int add(String txt) {
		int result = 0;
		
		if (txt.length() >=1){
			String[] numberList=txt.split(",|\n");
			for(String number : numberList){
				result+=Integer.parseInt(number);
			}
		}
			
		return result;

	}

}

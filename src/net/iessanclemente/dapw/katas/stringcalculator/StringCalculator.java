package net.iessanclemente.dapw.katas.stringcalculator;

public class StringCalculator {

	public int add(String txt) {
		int result = 0;
		
		if (txt.length() >=1){
			//if(txt.matches("//{}\n");
			String separators = ",|\n";
			if(txt.startsWith("//")){
				String customSeparator=txt.substring(2,3);
				txt=txt.substring(4);
				separators+="|"+ customSeparator;
			}
			String[] numberList=txt.split(separators);
			for(String number : numberList){
				result+=Integer.parseInt(number);
			}
		}
			
		return result;

	}

}

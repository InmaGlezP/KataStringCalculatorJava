package net.iessanclemente.dapw.katas.stringcalculator;

import java.util.ArrayList;
import java.util.List;

import net.iessanclemente.dapw.katas.stringcalculator.exceptions.NegativesNotSupportedException;

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
			List<Integer> negatives = new ArrayList<Integer>();
			
			for(String number : numberList){
				int n = Integer.parseInt(number);
				
				if(n<0){
					negatives.add(n);
				}
				result+=n;
			}
			if(negatives.size()>0){
				throw new NegativesNotSupportedException(negatives.toArray(new Integer[negatives.size()]));
			}
		}
			
		return result;

	}

}

package com.gqm.entornos.examen.sergio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SergioList implements SergioGarciaList2<String> {

	List<String> sergioList = new ArrayList<String>();
	
	public SergioList(String[] arr) {
		this.sergioList = Arrays.asList(arr);
	}
	 
	@Override
	public String[] firstHalf() {
		
		if (this.sergioList.size() == 1 ){
			return new String[] {this.sergioList.get(0)};
		}else {
			int halfLength = this.sergioList.size() / 2;
			
			String[] half = new String[halfLength];
		
			for (int i = 0; i < halfLength; i++) {
				half[i] = sergioList.get(i);
			}
			
			return half;
		}
	}

	@Override
	public int length() {

		return this.sergioList.size();
	}
	
	
	

}

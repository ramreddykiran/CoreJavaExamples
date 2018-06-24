package com.datatypes;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ClassUtils;

public class DataTypes {
	
	public static void main(String[] args) {
		//Boolean a = null;
		/*if(ClassUtils.isPrimitiveOrWrapper(a.getClass())) {
			
		}*/
		//System.out.println(Boolean.class.isInstance(a));
		alphabetsSum();
		
		
		
	}

	private static void alphabetsSum() {
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 'A'; i <= 'Z'; i++) {
			// System.out.println((char) i + " : " + (i - 'A' + 1));
			int a = (i - 'A' + 1);
			if (a % 2 == 0) {
				evenSum += a;
			} else {
				oddSum += a;
			}
		}
		System.out.println("event sum " + evenSum + " oddSum " + oddSum + " ; difference " + (evenSum - oddSum));
	}

}

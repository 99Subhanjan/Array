package com.array;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ArrayList <Details> arr = new ArrayList <Details> ();
		
		Details detail1 = new Details("Subhanjan", "3726 Valley view Ln", 23);
		Details detail2 = new Details("Subhanjan", "3726 Valley view Ln", 23);
		Details detail3 = new Details("Subhanjan", "3726 Valley view Ln", 23);
		Details detail4 = new Details("Subhanjan", "3726 Valley view Ln", 23);
		Details detail5 = new Details("Subhanjan", "3726 Valley view Ln", 23);
		
		arr.add( detail1);
		arr.add( detail2);
		arr.add( detail3);
		arr.add( detail4);
		arr.add( detail5);
		
		for(Details de: arr) {
			System.out.println(de.fullName);
			System.out.println(de.address);
			System.out.println(de.age);
		}
		
		
	}

}

package com.array.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringDemo {
	public static void main(String[] args) {

		String s = "vinitsalokhe3540@gmail.com";

		String result = s.replaceAll("[^!@#$%^&*]", "");
		System.out.println("Special cheracter is : " + result);
		String result1 = s.replace('@', '+');
		System.out.println("Replacements of Special cheracter is : " + result1);

		String rev1 = s.substring(s.indexOf('@'));
		System.out.println(rev1);
		String res = s.substring(0, s.lastIndexOf('@'));
		System.out.println("The result is : " + res);

//find the length of surname 		
		String sss = "vinit vilas salokhe ";
		// String ppp = sss.substring(sss.indexOf("s"));
		String ppp = sss.substring(12, sss.lastIndexOf(" "));
		System.out.println("The surname is : " + ppp);
		System.out.println("The total length of surname is : " + ppp.length());

		int temp = 0;
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(7);
		l.add(90);
		l.add(40);

		System.out.println(l);
		Collections.sort(l);
		temp = l.get(l.size() - 2);
		System.out.println(temp);
		
		System.out.println("---------------calculate length of surname-------------------");
		String s2 = "salim habib1224 shaikh";
		String[] words = s2.split(" "); // salimhabibshaikh
		String result12 = "";

		if (words.length >= 3) {
			for (int i = 2; i < words.length; i++) {
				result12 += words[i] + " ";
			}
			result12 = result12.trim();
		}

		System.out.println(result12);
		int stringCount = result12.length();
		System.out.println(stringCount);

	}

}

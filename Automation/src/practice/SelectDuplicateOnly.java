package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SelectDuplicateOnly {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("rohit");
		strList.add("sanjay");
		strList.add("rita");
		strList.add("sushi");
		strList.add("rohit");
		strList.add("rita");
		strList.add("vishwa");
		strList.add("priya");
		strList.add("priya");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Keyword");
		String input = sc.nextLine();
		for (int i = 0; i < strList.size(); i++) {
			if(strList.get(i).equalsIgnoreCase(input)) {
				System.out.println("Yes It is present Keyword is " +input +" And found :"+ strList.get(i) );
				break;
			}
		}
		System.out.println("-------------------------------------------");
		Collections.sort(strList);
		System.out.println(strList);
		Set<String> item = new HashSet<String>();
		for(int i = 0; i<strList.size();i++) {
			if (item.add(strList.get(i))) {
				
			}else {
				String duplicateItem = strList.get(i);
				System.out.println(duplicateItem);
			}
			
		}
		
	}

}

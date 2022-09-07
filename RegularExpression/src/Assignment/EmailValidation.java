package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("jack@gmail.com");
		String[] names = {"revathy@gmail.com","prem@gmail.com","chitra@gmail.com","geetha@yahoo.com","rose@yahoo.co.in"};
		System.out.println(names);
		Collections.addAll(list, names);
		list.add("raju@gmail.com");
		list.add("sai@gmail.com");
		list.add("vijay@gmail.com");
		list.add("arun@gmail.com");
		
		Iterator<String> iterator = list.iterator();
		System.out.println("Enter your Email ID");
		
		Scanner sc = new Scanner(System.in);  
	    Pattern p = Pattern.compile("^(.+)@(\\S+)$");
	    String input = sc.nextLine();
		Matcher m = p.matcher(input);
		boolean flag =false;
		if(m.matches())
		{
			while(iterator.hasNext())
			{
			String emailID = iterator.next();
			//System.out.println("Entered input is :  "+ input + " The value in the list is: " + emailID);
			if (input.equals(emailID)){
				System.out.println("You have entered the valid email id");
				flag = true;
				return;
			}
			}
			if(flag == false)
			{
				System.out.println("This email id does not exist");
			}
		}
		
		else
			System.out.println("Please kindly enter proper email id");
		
		
	}

}

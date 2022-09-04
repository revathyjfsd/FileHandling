package com.session4.regularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
public static void main(String args[])
{
	Pattern p = Pattern.compile("[a-z]+");
	String i = "gh";
	Matcher m = p.matcher(i);
	if(m.matches())
		System.out.println("matches");
	else
		System.out.println("not matching");
	
}
}

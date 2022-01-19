package com.te.sortingmethod;


	import java.util.Scanner;
	
	public class Palindrom {
	static boolean ispalindrom(String st){
	int i=0;
	while(i<st.length()/2){
	if(st.charAt(i)!=st.charAt(st.length()-1-i))
	return false;
	i++;
	}
	return true;
	}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the sentence.");
	String s=sc.nextLine();
	boolean str=ispalindrom(s);
	if(str)
	System.out.println(s+" is palindrom");
	else
	System.out.println(s+ " not palindrom");

}
	}

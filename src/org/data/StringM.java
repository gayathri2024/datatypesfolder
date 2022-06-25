package org.data;

public class StringM {
public static void main(String[] args) {
	String s="abhjkj%$#$ASD786";
	String r="";
	
	for (int i = 0; i<s.length(); i++) {
		char c = s.charAt(i);
		if((c>=65&&c<=90)||(c>=97&&c<=122))
		{
		r=r+c;
		
}
	}
	System.out.println(r);
}
}
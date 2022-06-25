package org.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sample {
	public static void main(String[] args) {
	String s="aebhiujkgo";
	int v=0,c=0;
	for (int i = 0; i < s.length(); i++) {
		char a = s.charAt(i);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
		{
			v++;
	}
	}
	
	
	System.out.println(v);

	}	
}
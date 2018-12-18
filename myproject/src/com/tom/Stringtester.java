package com.tom;

public class Stringtester {
	public static void main(String[] args){
		int n = 100;
		System.out.println(n != 99);
		System.out.println(n == 99);
		// only for practice
		String s = "Hello world " ;
		String s2 = new String("Hello world ");
		//                      01234567890
		String s3 = ("Jack Tom Eric");
//		              0123456789012
		System.out.println(s.equals(s == s2));
		System.out.println(s.substring(7));
		System.out.println(s.substring(0,7));
		// 將此字串反過來印 
		
		for(int i = s.length()-1; i>=0 ; i--){
			System.out.print(s.charAt(i));
		}
		
		System.out.println();
		System.out.println(s2.indexOf("w"));
		System.out.println();
		System.out.println(s2.lastIndexOf("l"));
				
//		將s3字串Tom都改成boss
		String name = "Tom";
		int index = s3.indexOf(name);
		System.out.println(index);
		System.out.println(s3.substring(0,index) + "boss" +  s3.substring(index+1));
		
		
	}
	
}

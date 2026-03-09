package base;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class CodePractice {
	public static void main(String[] args) {
		
		/*String s="Saikumar";
		
	         char [] a=s.toCharArray();
	        LinkedHashSet<Character> LHS= new LinkedHashSet<Character>();
	        for(char ch:a) {
	        	LHS.add(ch);
	        	
	        }
	        
	        for(char chr:LHS) {
	        	System.out.print(chr);
	        }
	        
	        */
		
		
		
		/*String s="Ganjikunta sai sai kumar";
		String [] ss=s.split("\\s");
		LinkedHashSet<String> LHS= new LinkedHashSet<String>();
		
	for(String sing:ss) {
		LHS.add(sing);
		
	}
		
		for(String str:LHS) {
			System.out.print(str+" ");
		}
		*/
		
		
		/* int a[]= {7,7,9,3,8,6,7,5,9,9};
		Arrays.sort(a);
		                                 
		
		for(int n:a) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		for(int i=a.length-2;i>=0;i--) {
			if(a[i]!=a[a.length-1]) {
				System.out.println(a[i]);
				break;
				
			}
		}
		
	        */
		
		
		/* String s="Ganjikunta sai";
		
		 char[] a=s.toCharArray();
		 
		 LinkedHashMap<Character,Integer> map= new LinkedHashMap <Character,Integer>();
		 
		 for(char c:a) {
			 if(map.containsKey(c)) {
				 map.put(c, map.get(c)+1);
			 }
			 
			 
		 else {
			 map.put(c, 1);
			 
		 }
			 
		 }
		 
		 System.out.println(map);
	        
	        
	        for(char ch:map.keySet()) {
	        	if(map.get(ch)>1) {
	        		System.out.println(ch+" "+map.get(ch));
	        	}
	        }
	        */
		
		/*String s="saikumar lover boy";
		String sre[]=s.split("\\s");
		
		String newword="";
		
		for(int i=sre.length-1;i>=0;i--) {
			newword=newword+sre[i]+" ";
			
		}
		
		System.out.println(newword);
		
		*/
		
		/* String s="saikumar lover boy";
		String sre[]=s.split("\\s");
		
		
		String mainu="";
		
		
		
		for(String str:sre) {
			String sub="";
			for(int i=str.length()-1;i>=0;i--) {
				sub=sub+str.charAt(i);
				
			}
			
			
			mainu=mainu+sub+" ";
			
		}
		
		System.out.println(mainu);
		
		*/
		
		
		/*int n=8776;
		int rev =0;
		
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		
		System.out.println(rev);
		
		*/
		
		
		/*int n=8776987;
		int even= 0;
		int odd=0;
		
		while(n!=0) {
			int N=n%10;
			
			if(N%2==0) {
				
				even++;
			}
				
				else {
					odd++;
				}
				
				n=n/10;
			}
		
		System.out.println(even);
		System.out.println(odd);
			
			
		}
		
		*/
		
		
	/*	String s="Ganjikunta";
		String sn="";
		
		for(int i=s.length()-1;i>=0;i--) {
			sn=sn+s.charAt(i);
		}
		System.out.println(sn);	
		
		
		if(sn.equals(s)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
		}
		
		*/
		
	/*	int a[]= {7,7,9,3,123,8,6,7,5,9,9,77,44,98};
		
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				
			}
		}
			
		System.out.println(min);
		
	*/
		int a[]= {7,7,9,123,8,6,7,5,9,9,77,44,98};
		int fixed=3;
		boolean b=false;
		
		for(int i=0;i<a.length;i++) {
			
		if(a[i]==fixed) {
			b=true;
		System.out.println("there");
		}
		
	}
			
		if(b==false) {
			System.out.println("not there");
			
		}
		

		

	}
}
		
		
		
		
	        
	        
	        
	        
	        
	        
	        
	        
	        
	



package tests;

import java.io.PrintStream;
import java.util.Arrays;

public class ExampleAPI {
	
	 
	public static void main(String[] args) {  
	/*try {
        System.out.println("A");
        int x = 99/0;
        System.out.println("B");
    }
    catch(ArithmeticException ae){
        System.out.println("C");
    }
	catch(Exception e){
        System.out.println("D");
	}
    finally{
        System.out.println("E");
    }
		
	
	String s="saikumar123ganjikunta";
	int b=s.lastIndexOf("a");
	// s.substring(6);
	System.out.println(b);
	System.out.println(s.substring(6,21));
		  
// System.out.println( (s.substring(6)));
//	
//  String ss =s.substring(0, b)+s.substring(11);
 * 
 * */
		
		
 
//
//   String s="udaykumar 6767ganjikunta";
//  int n=s.indexOf("6767");
//  System.out.println(n);
//  
//  if(n!=1) {
//	  
//	   String ss=s.subSequence(0, n)+s.substring(n+4);
//	   System.out.println(ss);
//	   
	   
	   
	  /* int [] in= {3,5,6,8,4,8};
	   
	   int n=in.length;
	   System.out.println(n);
	 
	System.out.println(Arrays.toString(in));
	   
	   for(int i=n-1;izzzzzzzzzzz;i++) {
		   for(int j=0;j<n-1;j++) {
			   
			   if(in[j]>in[j+1]) {
				   int temp=in[j];
				  
				   in[j]=in[j+1];
				   in[j+1]=temp;
				   
			   }
			   
		   }
	   }
	   
	   System.out.println(Arrays.toString(in));
	   
	   
//	   Arrays.sort(in);
//	   
//	   for(int i=in.length-2;i>=0;i--) {
//		   if(in[i]!=in[in.length-1]) {
//			   System.out.println(in[i]);
//			   break;
//		   }
//	   }
	   */
	   
	   int[] in = {3, 5, 6, 8, 4, 8};
       int n = in.length;
       System.out.println(n);
       System.out.println(Arrays.toString(in));
       for (int i = 0; i < n - 1; i++) {
           for (int j = 0; j < n - i - 1; j++) {
               if (in[j] < in[j + 1]) {
                   int temp = in[j];
                   in[j] = in[j + 1];
                   in[j + 1] = temp;
               }
           }
       }
       System.out.println(Arrays.toString(in));
	   
	   
	   
  }
 

}

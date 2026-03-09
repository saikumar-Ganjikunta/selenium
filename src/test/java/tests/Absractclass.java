package tests;

  abstract class Absractclass {
	  
	 
	   String s;
	 Absractclass(String s){
		 this.s =s;
	 }
	 
	
	public abstract void sai();
	
	public void m1() {
		System.out.println("saikumar");
	}
	


}
 
 
   class child extends Absractclass  {
	   
	   child(String ss){
		   super(ss);
		   
		  
	   }
	   
	   
	   public void sai() {
		   System.out.println("abstract method");
	   }
	   
	   public void m2() {
		   System.out.println("saikumar22");
	   }
	   
	  
	   
	   
	 
 }

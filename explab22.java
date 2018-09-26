//this keyword can be passed as an argument in the method.
		class Explab22{  
		  void m(Explab22 obj){  
		System.out.println("method is invoked");  
		  }  
		  void p(){  
		  m(this);  
		  }  
		
		  public static void main(String args[]){  
		  Explab22 s1 = new Explab22();  
		  s1.p();  
		  }  
		}  
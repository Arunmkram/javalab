//Example of Method Overloading with TypePromotion
		class Explab10{  
		  void sum(int a,long b){System.out.println(a+b);}  
		  void sum(int a,intb,int c){System.out.println(a+b+c);}  
		
		  public static void main(String args[]){  
		  Explab10 obj=new Explab10();  
		obj.sum(20,20);//now second int literal will be promoted to long  
		obj.sum(20,20,20);  
		
		  }  
		}  
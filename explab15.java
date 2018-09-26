//Program of counter without static variable
		class Explab15{  	
		int count=0;//will get memory when instance is created  
		
		Explab15(){
		count++;  
		System.out.println(count);  
		}  
		
		public static void main(String args[]){  
		
		Explab15 c1=new Explab15();  
		Explab15 c2=new Explab15();  
		Explab15 c3=new Explab15();  
		
		 }  
		}  
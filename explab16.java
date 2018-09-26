//Program of counter by static variable
		class Explab16{  
		static int count=0;//will get memory only once and retain its value  
		Explab16(){
		count++;  
		System.out.println(count);  
		}  
	public static void main(String args[]){  
		Explab16 c1=new Explab16();  
		Explab16 c2=new Explab16();  
		Explab16 c3=new Explab16();  
		 }  
		} 

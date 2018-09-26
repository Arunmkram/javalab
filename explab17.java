//Java static method
		//Program of changing the common property of all objects(static field).  
		
		class Explab17{  
		     int rollno;  
		     String name;  
		     static String college = "ITS";  
		
		     static void change(){  
		     college = "RIT";  
		     }  
		
		     Explab17(int r, String n){
		rollno = r;  
		     name = n;  
		     }  
		
		     void display (){System.out.println(rollno+""+name+""+college);}  
		
		    public static void main(String args[]){  
		    Exp17.change();  
		
		    Explab17 s1 = new Explab17 (111,"Deva");  
		    Explab17 s2 = new Explab17 (222,"Alai");  
		    Explab17 s3 = new Explab17 (333,"Dilipan");  
		
		    s1.display();  
		    s2.display();  
		    s3.display();  
		    }  
		}
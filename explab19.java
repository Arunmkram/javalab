//example of this keyword  
		class Explab19{  
		    int id;  
		    String name;  
		
		    Explab19(int id,String name){  
		    this.id = id;  
		    this.name = name;  
		    }  
		    void display(){System.out.println(id+""+name);}  
		    public static void main(String args[]){  
		    Explab19 s1 = new Explab19(111,"Deva");  
	            Explab19 s2 = new Explab19(222,"Alai");  
		    s1.display();  
		    s2.display();  
		}  
		}  
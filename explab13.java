//Java parameterized constructor
		class Explab13{  
		    int id;  
		    String name;  
		
		    Exp13(int i,String n){  
		    id = i;  
		    name = n;  
		    }  
		    void display(){System.out.println(id+""+name);}  
		
		    public static void main(String args[]){  
		    Explab13 s1 = new Explab13(111,"Deva");  
		    Explab13 s2 = new Explab13(222,"Alai");  
		    s1.display();  
		    s2.display();  
		   }  
		}  
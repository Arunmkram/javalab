//Understanding the problem without this keyword
		class Explab18{  
		    int id;  
		    String name;  
		
		    Explab18(int id,String name){  
		    id = id;  
		    name = name;  
		}  
		    void display(){System.out.println(id+""+name);}  
		
		    public static void main(String args[]){  
		    Explab18 s1 = new Explab18(111,"Deva");  
		    Explab18 s2 = new Explab18(321,"Alai");  
		    s1.display();  
		    s2.display();  
		    }  
		}  

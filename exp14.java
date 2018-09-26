//Java Copy Constructor
		class Explab14{  
		    int id;  
		    String name;  
		    Exp14(int i,String n){  
		    id = i;  
		    name = n;  
		    }  
		
		    Explab14(Explab14 s){
		    id = s.id;  
		    name =s.name;  
		    }  
		    void display(){System.out.println(id+""+name);}  
		
		    public static void main(String args[]){  
		    Explab14 s1 = new Explab14(111,"Deva");  
		    Explab14 s2 = new Explab14(s1);  
		    s1.display();  
		    s2.display();  
		   }  
		}  
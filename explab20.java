//Where to use this() constructor call?
		class Explab20{  
		    int id;  
		    String name;  
		    String city;  
		
		    Explab20(int id,String name){  
		    this.id = id;  
		    this.name = name;  
		    }  
		    Explab20(int id,Stringname,String city){  
		    this(id,name);//now no need to initialize id and name  
		this.city=city;  
		    }  
		    void display(){System.out.println(id+""+name+""+city);}  
		
		    public static void main(String args[]){  
		    Explab20 e1 = new Explab20(111,"Deva");  
		    Explab20 e2 = new Explab20(222,"Alai","Chennai");  
		    e1.display();  
		    e2.display();  
		   }  
		}  

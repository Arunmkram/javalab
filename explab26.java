class Explab26{  
	void msg(){System.out.println("Hello");}  
	}  
	class B{
	void msg(){System.out.println("Welcome");}  
	}  
	class C extends Explab26,B{//suppose if it were  
	
	 public Static void main(String args[]){  
	   C obj=new C();  
	obj.msg();//Now which msg() method would be invoked?  
	}  
	}  
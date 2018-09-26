//Understanding the problem without method overriding
	class Explab28{  
	  void run(){System.out.println("Vehicle is running");}  

	 public static void main(String args[]){  
	  Bike obj = new Bike();  
	obj.run();  
	  }  
	}  
	class Bike extends Explab28{  
	
	  public static void main(String args[]){  
	  Bike obj = new Bike();  
	obj.run();  
	  }  
	}  
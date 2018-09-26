//The this keyword can be passed as argument in the constructor call.
class B{
  Explab23 obj;  
B(Explab23 obj){  
    this.obj=obj;  
  }  
  void display(){  
System.out.println(obj.data);//using data member of Exp23 class  
  }  
}  

class Explab23{  
  int data=10;  
  Explab23(){
   B b=new B(this);  
b.display();  
  }  
  public static void main(String args[]){  
   Explab23 a=new Explab23();  
  }  
}  
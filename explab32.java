//super is used to invoke parent class constructor. class Bike5{

Bike5(){System.out.println("Vehicle is created");}

}

class Explab32 extends Bike5{ Explab32(){

super();//will invoke parent class constructor System.out.println("Bike is created");
}

public static void main(String args[]){ Explab32 b=new Explab32();

}
}
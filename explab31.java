//Solution by super keyword class Bike1 {

int speed=50;
}

class Explab31 extends Bike1{ int speed=100;

void display(){

System.out.println(super.speed);//will print speed of Vehicle now
}

public static void main(String args[]){ Explab31 b=new Explab31();

b.display();

}

}

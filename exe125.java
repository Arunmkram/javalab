public class Exp125 extends Thread{ public void run(){

if(Thread.currentThread().isDaemon()){//checking for daemon thread System.out.println("daemon thread work");

}
else{

System.out.println("user thread work");
}

}

public static void main(String[] args){ Exp125 t1=new Exp125();//creating thread Exp125 t2=new Exp125();
Exp125 t3=new Exp125();

t1.setDaemon(true);//now t1 is daemon thread

t1.start();//starting threads
t2.start();

t3.start();
}

}


class Employee{
 float salary=40000;  
}  
class Explab25 extends Employee{
 int bonus=10000;  
 public static void main(String args[]){  
   Explab25 p=new Explab25();  
System.out.println("Programmer salary is:"+p.salary);  
System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}  
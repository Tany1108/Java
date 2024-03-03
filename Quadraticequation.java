import java.util.*;
import java.lang.Math;
class Quadratic{
float a,b,c,d,r1,r2;

void getd(){
Scanner in=new Scanner(System.in);
System.out.println("Enter value of a:");
a=in.nextFloat();
System.out.println("Enter value of b:");
b=in.nextFloat();
System.out.println("Enter value of c:");
c=in.nextFloat();
}
void display(){
d=(b*b)-(4*a*c);
if(d==0.0){
System.out.println("The roots are real and equal.");
r1=(float)(-b+Math.sqrt(d))/(2*a);
System.out.println("The roots are :"+r1+" and "+r1);

}
else if(d>0.0){
r1=(float)(-b+Math.sqrt(d))/(2*a);
r2=(float)(-b-Math.sqrt(d))/(2*a);
System.out.println("The roots are real and unequal.");
System.out.println("The roots are :"+r1+" and "+r2);
}
else{
System.out.println("There are no real roots");}
}
}
class Quadraticequation
{
public static void main(String args[])
{
System.out.println("Tanya D Shetty");
System.out.println("1BM22CS337");
Quadratic q=new Quadratic();
q.getd();
q.display();
}
}
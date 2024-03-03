import java.util.*;
abstract class Shape{
int a,b;
abstract void printArea( );
}
class Rectangle extends Shape{
void printArea(){
System.out.println("area of rectangle:"+(a*b)+"\n");}}

class Triangle extends Shape{
void printArea(){
System.out.println("area of triangle:"+(0.5*a*b)+"\n");}}

class Circle extends Shape{
void printArea(){
System.out.println("area of rectangle:"+(3.142*a*a)+"\n");}}

class Abstract
{
public static void main(String args[])
{
System.out.println("Tanya D Shetty");
System.out.println("1BM22CS337");
Scanner in=new Scanner(System.in);
Rectangle r=new Rectangle();
Triangle t=new Triangle();
Circle c=new Circle();
System.out.println("Enter length and breadth of rectangle:");
r.a=in.nextInt();
r.b=in.nextInt();
r.printArea();

System.out.println("Enter height and base of triangle:");
t.a=in.nextInt();
t.b=in.nextInt();
t.printArea();

System.out.println("Enter radius of circle:");
c.a=in.nextInt();
c.printArea();

}
}
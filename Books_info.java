import java.util.*;
class Books{

int num_pages;
String name=new String();
String author=new String();
float price;
Books(){}
Books(String name,String author,float price,int num_pages){
this.name=name;
this.author=author;
this.price=price;
this.num_pages=num_pages;
}
public String toString(){
String a,b,c,d;
a = "Book name: " + this.name + "\n";

b="Book author: "+ this.author + "\n";
c="Book price:"+this.price+"\n";
d="Number of pages:"+this.num_pages+ "\n";
return a+b+c+d;
}
}
class Books_info{
public static void main(String args[])
{

int n,num_pages;
String name=new String();
String author=new String();
float price;
System.out.println("Tanya D Shetty");
System.out.println("1BM22CS337");
Scanner in=new Scanner(System.in);
System.out.println("Enter number of Books");
n=in.nextInt();
Books b[]=new Books[n];

for(int i=0;i<n;i++){
System.out.println("enter details of book "+(i+1)+":");
System.out.println("Enter book title:");
name=in.next();
System.out.println("Enter book author");
author=in.next();
System.out.println("Enter book price:");
price=in.nextFloat();
System.out.println("Enter book pages:");
num_pages=in.nextInt();
b[i]=new Books(name,author,price,num_pages);
}

for(int i=0;i<n;i++){
System.out.println("details of book "+(i+1)+ "\n" +b[i]);
}
}
}
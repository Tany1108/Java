import java.util.*;
class Student{

int usn;
String name=new String();
double marks[]=new double[6];   
double ind_tot=0.0,percentage;

void getd(){
Scanner in=new Scanner(System.in);
System.out.println("Enter USN:");
usn=in.nextInt();
System.out.println("Enter name:");
name=in.next();
System.out.println("Enter subject marks(out of 100):");

for(int i=0;i<=5;i++){
System.out.println("Enter marks of subject "+(i+1)+":");
marks[i]=in.nextDouble();
}
}


double percen(){
double total=600.0;
for(int i=0;i<6;i++){
ind_tot=ind_tot+marks[i];
}
return ((ind_tot/total)*100);
}


void display(){
System.out.println("usn:"+usn);
System.out.println("name:"+name);


}
}

class Student_info
{
public static void main(String args[])
{
int n;
System.out.println("Tanya D Shetty");
System.out.println("1BM22CS337");
Scanner input=new Scanner(System.in);
System.out.println("Enter number of students");
n=input.nextInt();
Student s[]=new Student[n];

for(int i=0;i<n;i++){
s[i]=new Student();
s[i].getd();
}

for(int i=0;i<n;i++){
System.out.println("details of student "+(i+1)+" are :");
s[i].display();
double c=s[i].percen();
System.out.println("Total percentage in all subjects:"+c);
}

}
}
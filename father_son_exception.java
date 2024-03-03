import java.util.*;
class WrongAge extends Exception{
public WrongAge(String str){
super(str);}
}

class father{
int f_age;

father(int age) throws WrongAge{
f_age=age;
if(age<=0){

throw new WrongAge("age must be above 0");
}
}
}
class son extends father{
int s_age;
son(int age,int fage) throws WrongAge{
super(fage); 
s_age=age;
if(s_age>=fage){
throw new WrongAge("age must be lesser than fathers age");
}
}
}

class father_son_exception{
public static void main(String args[]){
System.out.println("Tanya D Shetty");
System.out.println("1BM22CS337");
int f_age,s_age;
Scanner in=new Scanner(System.in);
System.out.println("enter father's age");
f_age=in.nextInt();
try{
father f=new father(f_age);
}
catch(WrongAge e){System.out.println("Exception:age must be above 0");}
System.out.println("enter son's age");
s_age=in.nextInt();
try{
son s=new son(s_age,f_age);
}catch(WrongAge e){System.out.println("Exception:"+e.getMessage());}
}
}
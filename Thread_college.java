class bms extends Thread{
public void run(){
try{
for(int i=0;i<20;i++){
System.out.println("BMS COLLEGE OF ENGINEERING");
Thread.sleep(10000);
}
}
catch(InterruptedException e)
{
System.out.println("Exception handled");
}

}

}
class cse extends Thread{
public void run(){
try{
for(int i=0;i<20;i++){
System.out.println("CSE");
Thread.sleep(2000);
}

}
catch(InterruptedException e){
System.out.println("ENDED");}
{
System.out.println("Exception handled");
}

}

}
class Thread_college{
 public static void main(String args[]){

System.out.println("TANYA D SHETTY");
System.out.println("1BM22CS337");
bms b=new bms();
cse c=new cse();
c.start();
b.start();
try{
b.join();
c.join();}
catch(InterruptedException e)
{
System.out.println("Exception handled");
}
{
System.out.println("ENDED");}

}
}
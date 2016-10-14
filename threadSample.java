class mythread extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
System.out.println("First Thread" +i);

}
}
class mythread1 extends Thread{
public void run()
{
for(int i=1;i<=5;i++)
System.out.println("Second thread" +i);
}
}
class threadSample
{
public static void main(String args[])
{
mythread ob1= new mythread();
mythread1 ob2= new mythread1();
ob1.start();
ob2.start();
}
}
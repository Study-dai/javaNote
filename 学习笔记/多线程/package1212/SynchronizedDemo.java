package package1212;
class SomeObject{}

public class SynchronizedDemo {
public synchronized void method(){}

public static synchronized void staticMethed(){
}
public void someMethod(){
    synchronized (this){

    }
}
    public static void main(String[] args) {
        Object o=new Object();
        synchronized (o){}
        synchronized (SynchronizedDemo.class){

        }
        Class<?>cls1=SomeObject.class;
        SomeObject someObject=new SomeObject();
        Class<?>cls2=someObject.getClass();
        System.out.println(cls1==cls2);
    }
}

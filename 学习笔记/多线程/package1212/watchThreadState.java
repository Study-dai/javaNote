package package1212;
//观察线程状态
public class watchThreadState {
     static class MyThread extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(100000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        MyThread thread=new MyThread();
        System.out.println(thread.getState());//NEW
        thread.start();
        System.out.println(thread.getState());//RUNNABLE
        while(thread.isAlive()){
            System.out.println(thread.getState());
        }
        System.out.println(thread.getState());
    }
}

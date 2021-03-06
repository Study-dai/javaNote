package package1210;
//多线程实现斐波那契数列
import java.util.Scanner;
public class Scene2 {
    //递归实现
    private static long fib(int n){
        if(n<2){
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
    private static class MyThread extends Thread{
        private int n;
        MyThread(int n){
            this.n=n;
        }
        @Override
        public void run() {
           long result=fib(n);
            System.out.printf("fib(%d)的计算结果是（%d%n",n,result);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.print("请输入n: ");
            //主线程等待来客人，没人来之前一直在等
            int n=scanner.nextInt();
            //来了客人，就找个人过来干活
            Thread thread=new MyThread(n);
            thread.start();
        }
    }
}

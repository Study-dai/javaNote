判定一个数字是否是素数 
   public class Test{
    public static void main(String[] args) {
        int a=8;
        int b = 2;
        while (a > b) {
            if (a%b == 0) {
            System.out.printf("%d是素数\n",a);
                break;
            }
            else
            System.out.printf("%d不是素数\n",a);
        }  
    }
}
优化代码：
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入要判断的数字:");
	int a = sc.nextInt();
	int b = 2;
	while (a > b) {
	if (a%b == 0) {
	System.out.printf("%d是素数\n", a);
	}else{
                System.out.printf("%d不是素数\n", a);
                a++;
                break;
	}
     }
}
输出乘法口诀表 
public class Test {
	public static void main(String[] args) {
        int i=0;
        int j=0;
        for (i=1;i<=9;i++){
            for(j=1;j<=i;j++){
                  System.out.printf("%d*%d=%2d ",j,i,i*j);
            }
           System.out.printf("\n");
        }
        }
    }
//执行结果
1*1= 1  
1*2= 2  2*2= 4  
1*3= 3  2*3= 6  3*3= 9  
1*4= 4  2*4= 8  3*4=12  4*4=16  
1*5= 5  2*5=10  3*5=15  4*5=20  5*5=25  
1*6= 6  2*6=12  3*6=18  4*6=24  5*6=30  6*6=36  
1*7= 7  2*7=14  3*7=21  4*7=28  5*7=35  6*7=42  7*7=49  
1*8= 8  2*8=16  3*8=24  4*8=32  5*8=40  6*8=48  7*8=56  8*8=64  

Process finished with exit code 0
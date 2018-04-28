import java.util.Scanner;
public class noob {
    public static void main(String [] args) {
	int a = 0;
    do{
    System.out.println("输入第一个数吧= =");
    Scanner scanner1 = new Scanner(System.in);
    double x;
    x = scanner1.nextDouble();
    System.out.println("你要用什么为难我= =");
    Scanner scanner2 = new Scanner (System.in);
    String op;
    op = scanner2.next();
    System.out.println("好吧，你可以输入第二个数了= =");
    Scanner scanner3 = new Scanner(System.in);
    double y;
    y = scanner3.nextDouble();
    char z = op.charAt(0);
    if(z=='+')
    System.out.printf("%f",x+y);
    else if(z=='-')
    System.out.printf("%f",x-y);
    else if(z=='*')
    System.out.printf("%f",x*y);
    else if(z=='/') {
    if (y==0){
    System.out.println("会不会算数！除数怎么可以是0 ？？");  
    }
    else{
    System.out.printf("%f",x/y);
  }
}
	System.out.println("input 0 to continue, else to stop!");
    Scanner scanner4 = new Scanner(System.in);
    a = scanner4.nextInt();
  }while(a == 0);
}
}

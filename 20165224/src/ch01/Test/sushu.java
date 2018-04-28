public class sushu {
    public static void main(String [] args) {
    int b;
    for (int a=2;a<=100;a++) {
    for( b =2;b<=a/2;b++) {
    if(a%b==0)
    break;
    }
    if(b>a/2)
    System.out.print(""+a+"是素数");
    }
    }
}

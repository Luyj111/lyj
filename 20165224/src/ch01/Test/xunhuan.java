public class xunhuan {
    public static void main(String [] args) {
    double sum = 0;
    int i;
    for(i=1;i<=20;i++) {
    sum=sum+1.0/fact(i);
    }
    System.out.println(sum);
    }
    public static int fact (int n ) {
    if (n==0)
    return 1;
    else
    return fact(n-1)*n;
    }
}

public class xunhuan2 {
    public static void main(String [] args) {
    long i=1,sum=0;
    int a=8,item=a;
    for(i=1;i<=10;i++) 
    {
    sum=sum+item;
    item = item*10+a;
    }
    System.out.println(sum);
    }
}

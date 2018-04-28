public class jiafa {
    public static void main(String [] args) {
      int sum = 0;
      int n = 10;
      for (int i = 1;i<=n;i++) {
      sum = sum+fact(i);
    }
      System.out.println(sum);
    }
    public static int fact (int i) {
   if (i==0)
    return 1;
   else
    return fact(i-1)*i;
    }
}

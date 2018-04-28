public class diedai {
    public static void main(String args[]) {
        int [] m=new int[args.length];
        for(int i=0;i<args.length;i++)
            m[i]=Integer.parseInt(args[i]);
        System.out.println(count(m[0],m[1]));
    }
    public static int count(int n,int m){
        if(n<m||n<0||m<0){
            return 0;
        }
        else {
            if(m==0)
            {
                return 1;
            }
            else{
                return count(n-1,m-1)+count(n-1,m);
        }
        }
    }

}


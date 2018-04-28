package cal;
import java.util.*;
public class noobTest {
    public static void main(String[] args) {
        noob lt = new noob();
        String str = "2+1-3*5+4/4-2*(4+2)";
        List<String> list = lt.work(str);
        List<String> list2 = lt.InfixToPostfix(list);
        System.out.println("第一题：："+str);
        System.out.print("我其实是这么算的：");
        lt.printList(list2);
        System.out.println(" ");
        System.out.println("答案："+lt.doCal(list2));
        System.out.println(" ");

        String str1 = "10+(3-1)*3+10/3";
        List<String> list3 = lt.work(str1);
        List<String> list4 = lt.InfixToPostfix(list3);
        System.out.println("第二题："+str1);
        System.out.println("答案："+lt.doCal(list4));

        String str2 = "4-（2+3）*5/（5+5）";
        List<String> list5 = lt.work(str2);
        List<String> list6 = lt.InfixToPostfix(list5);
        System.out.println("第三题："+str2);
        System.out.println("答案："+lt.doCal(list6));
    }
} 

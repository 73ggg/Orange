package green.to.blue;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class changer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(100);
        int count1=0, count2 = 0, count3 = 0;
        while (true) {
            System.out.println("请输入数字：");
            int b = sc.nextInt();
            count1++;
            count2++;
            count3++;
            if (count1 == 10){
                System.out.println("恭喜你，你猜对了");
                break;
            }else if (count2%3==0){
                int min=a-5;
                int max=a+5;
                if(min<0){
                    min=0;
                }else if(max>100){
                    max=100;
                }
                System.out.println("你已猜"+count2+"次，数字在"+min+"到"+max+"之间");
            }
            if (a > b) {
                System.out.println("你输入的数字比答案小,已猜次数："+count3+"次");
            } else if (a < b) {
                System.out.println("你输入的数字比答案大，已猜次数："+count3+"次");
            }
            else {
                System.out.println("恭喜你，你猜对了");
                break;
            }
        }
    }
}
pacakage classWork;
import Java.util.Scanner;
public class ClassWork{
	public static void main(String[] args){

		Scanner input=new Scanner(System.in);

		//Chapter 1 page11
		//第一题：Java执行过程：编写->编译->执行，编译原理：虚拟机编译
		//第二题：Plan table
		System.out.println("1.每天听课2小时，边学边练习，练习至少4个小时");
		System.out.println("2.学习时间：早上八点到十一点，晚上：七点到十点");
		System.out.println("3.本周学完java基础语法课程的专题1和专题2，阅读完教材，完成所有练习加油！\n");

		//第三题：schedule
		System.out.println("\&\&\&\&\&\&*课程表*");
        System.out.println("--------------------------------");
        System.out.println("星期 \&\&早上 \&\&下午");
        System.out.println("--------------------------------");
        System.out.println("周一 \&\&英语 \&\&高数");
        System.out.println("周二 \&\&政治\&\&计算机网络");
        System.out.println("周三 \&\&c++ \&\&java");
        System.out.println("周四 \&\&数据结构 \&\&java");
        System.out.println("周五 \&\&数据库 \&\&操作系统");
        System.out.println("--------------------------------");

        //Chapter 2 page33
        //第一题：计算工资明细
        System.out.print("请输入基本工资")；
        int salary = input.nextInt();
        System.out.println("该员工的工资明细为：")；
        System.out.println("基本工资为："+salary)；
        System.out.println("物价津贴为："+(salary*40%))；
        System.out.println("房租津贴为："+(salary*25%))；
        System.out.println("员工薪水是："+(salary+salary*40%+salary*25%))；
        
        //第二题：实现牌的交换
        int card1=10;
        int card2=8;
        int cardbox=0;
        System.out.println("互换前手中的纸牌");
        System.out.println("右手的牌："+card1);
        System.out.println("左手的牌："+card2);
        System.out.println("互换后手中的纸牌");
        cardbox=card1;
        card1=card2;
        card2=cardbox;
        System.out.println("右手的牌："+card1);
        System.out.println("左手的牌："+card2);
        
        //第三题：实现本息输出
        System.out.println("请输入本金：");
        double money = input.nextDouble();

        System.out.println("存款一年后的本息是："+(money*(1+0.0225)));
        System.out.println("存款两年后的本息是："+(money*(2+0.027)));
        System.out.println("存款三年后的本息是："+(money*(3+0.0324)));
        System.out.println("存款五年后的本息是："+(money*(5+0.036)));



	}
}

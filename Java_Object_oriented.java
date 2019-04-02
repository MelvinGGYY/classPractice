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

        //Chapter 3 page60
        //第一题：输入数字，输出最大值和最小值，输入0结束
        int max;
        int min;
        int num;
        System.out.print("请输入一个整数：");
        min=max=input.nextInt();
        System.out.print("请输入一个整数：");
        num = input.nextInt();
        if (num>max){
                max = num;
        }else {
                min = num;
        }
        while(true){
               System.out.print("请输入一个整数（输入0结束）：");
               num= input.nextInt();            
               if(num==0){
                break;
               }

                if (num>max){
                max = num;
                }else if(num<min){
                min = num;
                }
        }
        System.out.print("最大值是："+max+"，最小值是："+min);

        //第二题：输入1-7，输出对应星期，输入0程序结束
       int d;
        do{
            System.out.println("请输入数字1-7，输入0结束：");
             d = input.nextInt();
             System.out.print("今天是 ");
                        switch(d){
                                case 1:
                                System.out.println("Mon");
                                break;
                                case 2:
                                System.out.println("Tues");
                                break;
                                case 3:
                                System.out.println("Wed");
                                break;
                                case 4:
                                System.out.println("Turs");
                                break;
                                case 5:
                                System.out.println("Fir");
                                break;
                                case 6:
                                System.out.println("Sat");
                                break;
                                case 7:
                                System.out.println("Sun");
                                break;
                                default:
                                System.out.println("wrong day");
                                break;
                        }
                        
                 }while(d!=0);

        //第三题：机票原价5000，4~10月旺季，11~3月淡季，旺季头等舱9折，经济城6折，淡季头等舱5折，经济舱4折

        System.out.print("请输入您出行的月份1~12:");
        int tMonth = input.nextInt();
        System.out.print("请选择舱位:（头1，经2）：");
        int pClass= input.nextInt();
        if(tMonth>=4&&tMonth<=10){
                switch(pClass){
                  case 1:
                  System.out.println("4500rmb");
                  break;
                  case 2:
                  System.out.println("3000rmb");
                  break;
                  default:
                  break;
                }
        }else{
               switch(pClass){
                  case 1:
                  System.out.println("2500rmb");
                  break;
                  case 2:
                  System.out.println("2000rmb");
                  break;
                  default:
                  break;  
        }
}
}

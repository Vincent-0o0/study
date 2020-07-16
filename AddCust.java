package com.study;

import java.util.Scanner;

public class AddCust {
    public static void main(String[] args) {
        System.out.println("欢迎你登陆会员系统");
        System.out.println("添加用户信息");
        Scanner sc = new Scanner(System.in);
        System.out.println("输入会员号码");
        String number = sc.nextLine();
        if (number.length() == 4) {
            System.out.println("输入会员生日");
            String birthday = sc.nextLine();
            System.out.println("请输入会员积分");
            String score = sc.nextLine();
            System.out.println(number + "-" + birthday + "-" + score);
        } else {
            System.err.println("输入信息错误");
        }

    }
}

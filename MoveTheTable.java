package com.study;

import java.util.Scanner;

public class MoveTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("你的性别是？");
        String sex = sc.nextLine();
        System.out.println("你的年龄是？");
        String age = sc.nextLine();
        int ages = Integer.parseInt(age);
        if (sex.equals("男") && ages >= 7) {
            System.out.println("你可以搬动桌子！");
        } else {
            System.err.println("你还小，搬个锤子");
        }
    }
}

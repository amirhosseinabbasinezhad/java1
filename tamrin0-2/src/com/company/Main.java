package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner n=new Scanner(System.in);
        int c,max=0;
        System.out.println("تعداد اعدادی که میخواهیدوارد کنید:");
        c=n.nextInt();
        int a[] = new int[c],i;
        for (i=0;i<c;i++){
            System.out.println(" عددی وارد کنید");
            a[i]=n.nextInt();
        }
        for (i=0;i<c;i++){
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("ماکسیمم برابر است با:"+max);

    }
}

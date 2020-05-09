package com.company;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("تمرین منزل");

        int c,b,i;
        Scanner n = new Scanner(System.in);
        System.out.println("لطفا تعداد اعدادی که میخواهید وارد کنید");
        c = n.nextInt();
        int a[] = new int [c];
        for (i = 0; i < c; i++) {
            System.out.println("لطفاعددی وارد کنید");
            a[i] = n.nextInt();
        }
        System.out.println("لطفا عددی که میخواهید جستجو کنید وارد کنید");
        b = n.nextInt();
        boolean found = false;
            for (int x : a) {
                if (x == b) {
                    found = true;
                    break;
                }
            }

        if (found) {
            System.out.println("عدد پیدا شد");
        }

    }}
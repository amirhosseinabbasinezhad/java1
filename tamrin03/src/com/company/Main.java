package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float a,b,result;
        int c;
        Scanner n=new Scanner(System.in);
        System.out.println("لطفا دو عدد وارد کنید");
        System.out.println("عدد اول");
        a=n.nextInt();
        System.out.println("عدد دوم");
        b=n.nextInt();
        System.out.println("1-نمایش حاصل جمع\n2-نمایش حاصل تفریق\n3-نمایش حاصل ضرب\n4-نمایش حاصل تقسیم");
        c=n.nextInt();
        switch (c){
            case 1:
                result=a+b;
                System.out.println("حاصل جمع برابر:"+result);
                break;
            case 2:
                if((a-b)<0)
                    result=b-a;

                else
                    result=a-b;
                System.out.println("حاصل تفریق برابر:"+result);
            case 3:
                result=a*b;
                System.out.println("حاصل ضرب برابر:"+result);
            case 4:
                result=a/b;
                System.out.println("حاصل تقسیم برابر:"+result);
        }
    }
}

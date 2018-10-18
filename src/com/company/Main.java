package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        string5();
    }
    public static void string5(){
        Scanner scan=new Scanner(System.in);
        int n=5;
        String str [] = new String[n];

        for (int i = 0; i <str.length; i++) {
            System.out.println("Введите строку "+( i+1)+ ":");
            str[i]=scan.next();
        }
        if (str[3].equals(str[4])==true){
            str[0]=str[0].concat(str[1]);
        }
        else
            str[0]=str[0].concat(str[2]);
        System.out.println("Результат:"+str[0]);




    }
}

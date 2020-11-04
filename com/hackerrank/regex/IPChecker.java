package com.hackerrank.regex;

import java.util.Scanner;

public class IPChecker {public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    while(in.hasNext()){
        String IP = in.next();
        System.out.println(IP.matches(new MyRegex().pattern));
    }

}
}
class MyRegex{
public  String singlePattern = "(\\d\\d|\\d|[01]\\d\\d|2[0-4]\\d|25[0-5])";
public  String pattern = singlePattern+"."+singlePattern+"."+singlePattern+"."+singlePattern;
}
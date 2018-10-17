package com.dragon.design_patterns.fourteen_chapter.strategy_enum;

import java.util.Arrays;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        String source = "1234567890";
        String symbolChar = "+-";
        Random rand = new Random();

        int a = Integer.parseInt(String.valueOf(source.charAt(rand.nextInt(source.length()))));
        String symbol = String.valueOf(symbolChar.charAt(rand.nextInt(symbolChar.length())));
        int b = Integer.parseInt(String.valueOf(source.charAt(rand.nextInt(source.length()))));

        System.out.println("运行结果为" + a + symbol+ b + "=" + Calculator.ADD.exec(a,b));
    }
}

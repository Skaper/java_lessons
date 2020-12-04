package com.company;

public class IntegralTypes {
    public static void main(String[] args) {
        // Вот тут будет ошибка, т.к. у нас диапазон от -128 до 127!
        byte b = 216;
        short s = 1123;
        int i = 64536;
        // Постфикс l или L обозначает литералы типа long
        long l = 2147483648L;
        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
    }
}

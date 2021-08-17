package com.lomov;

public class Main {
    public static void main(String[] args) {
        Auto text = new Auto("Текст тест");
    }
}
class Auto {
    private String text;
        public Auto(String text){
            this.text = text;
            System.out.println(text);
        }
    }
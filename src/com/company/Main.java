package com.company;

public class Main {


    public static void main(String[] args) {

        // Задача 1

        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS о ссылке");
        }

        // Задача 2

        int clientDeviceYear = 2014;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        // Задача 3

        int year = 2021;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача 4

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется один день");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется два дня");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется три дня");
        }
        // Задача 4/2
        int deliveryDays = 1;
        if (deliveryDistance < 20){
            System.out.println(deliveryDays ++);
        }
        if (deliveryDays < 60){
            System.out.println(deliveryDays ++);
        }
        if (deliveryDays < 100){
            System.out.println(deliveryDays ++);
        }
        if (deliveryDays < 140){
            System.out.println(deliveryDays ++);
        }
        if (deliveryDays > 140){
            System.out.println("У нас проблема");
        }
        System.out.println("Дней для доставки " + deliveryDays);

        // Задача 5
        int monthNumber = 8;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такой месяц не существует");
        }
    }
}











package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
    int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    SalesService service = new SalesService();

    int sum = service.sum(arr);
        System.out.println(sum);


    int middleSum = service.middleSum(arr);
        System.out.println(middleSum);

    int maxSales = service.maxSales(arr);
        System.out.println(maxSales);

    int minSales = service.minSales(arr);
    System.out.println(minSales);
    int minThanMiddle = service.lowerMiddleSum(arr);
        System.out.println(minThanMiddle);
    int upperThanMiddle = service.upperMiddleSum(arr);
        System.out.println(upperThanMiddle);


    }






}
package ru.netology.stats;

public class SalesService {
    public int sum(int[] arr) {
        int length = arr.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int middleSum(int[] arr) {

        SalesService service = new SalesService();
        int length = arr.length;
        int sum = service.sum(arr);
        return sum / length;
    }

    public int maxSales(int[] arr) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(int[] arr) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int lowerMiddleSum(int[] arr) {
        SalesService service = new SalesService();
        int middleSum = service.middleSum(arr);
        int length = arr.length;
        int minThanMiddle = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] < middleSum) {
                minThanMiddle++;
            }
        }
        return minThanMiddle;
    }

    public int upperMiddleSum(int[] arr) {
        SalesService service = new SalesService();
        int middleSum = service.middleSum(arr);
        int length = arr.length;
        int moreThanMiddle = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] > middleSum) {
                moreThanMiddle++;
            }
        }
        return moreThanMiddle;
    }
}


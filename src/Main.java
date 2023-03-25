import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во менеджеров:");
        int[] number = new int [scanner.nextInt()];

        for (int x = 0; x < number.length; x++){
            System.out.println("Введите кол-во продаж менеджера: ");
            number[x] = scanner.nextInt();
        }

        SalesManager salesManager =new SalesManager(number);

        System.out.println("Максимальное кол-во продаж: " + salesManager.max());
        System.out.println("Минимальное кол-во продаж: " + salesManager.min());
        System.out.println("Среднее кол-во продаж: " + salesManager.averageValue());
    }
}
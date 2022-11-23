import java.util.Scanner;

public class Ex2_alg {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String a = scr.nextLine();
        if (a.equals("Вячеслав") || a.equals("вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

    }
}

/*
Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
 */

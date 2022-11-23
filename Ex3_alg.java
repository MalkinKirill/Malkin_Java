import java.util.Scanner;

public class Ex3_alg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите нужное число элементов массива: ");
        int countarrey = sc.nextInt();
        int [] array = new int[countarrey];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int a = 0; a < array.length; a++) {
            if (array[a] % 3 == 0) {
                System.out.println(array[a] + " - число кратное трем.");
            }
        }

    }
}

/*
Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
 */
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // в исходном файле записан массив вещественных чисел:
        File file = getFileFromUser();
        Scanner sc;
        try {
            sc = new Scanner(file);
        }
        catch(Exception e) {
            System.out.println("Не удалось прочитать файл");
            return;
        }
            // в первой строчке целое число n,
            int n = sc.nextInt();
        // во второй строчке n вещественных чисел
        sc.nextLine();
;        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        // Определить медианное значение
        Arrays.sort(arr);
        double med;
        if(n % 2 > 0){
            med = (arr[n/2] + arr[n/2 + 1]) / 2;
        }
        else {
            med = arr[n / 2];
        }
        System.out.println("медианное значение: " + med);
    }

    static File getFileFromUser(){
        System.out.println("Имя файла: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return new File(name);
    }

}
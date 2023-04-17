import java.util.LinkedList;
import java.util.Scanner;

/**
 * The type Main.
 *
 * @author Драгун Д.С.
 */
public class Main {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.print("Количество чисел в списке: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++){
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            list.add(num);
        }
        int sum = 0;
        for (int num : list){
            sum +=num;
        }
        System.out.print("Сумма чисел = " + sum);
    }
}
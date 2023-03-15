import java.util.Scanner;
class TaskBadSol {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
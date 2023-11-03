import java.util.Random;
import java.util.Scanner;

public class homework22 {
  public static void main(String[] args) {

    public static void main (String[]args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("inputt natur num");
      int n = scanner.nextInt();
      if (n <= 0) {
        System.out.println("you inputted not a natural num");
        return;
      }

      int[] arr = new int[n];
      Random random = new Random();
      arr[0] = random.nextInt(10);

      for (int i = 1; i < arr.length; i++) {
        arr[i] = arr[i - 1] + random.nextInt(10);
        System.out.print(arr[i] + " ");
      }
    }
  }
}

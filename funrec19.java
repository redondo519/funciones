import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class funrec19 {

    public static int[] rellenaPares(int longitud, int fin){

        int[] nums = new int[longitud];
        Random r = new Random();

        for(int i = 0; i < nums.length; i++){
            nums[i] = r.nextInt(2,fin+1);
        }
        return nums;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Instroduce longitud: ");
        int longitud = sc.nextInt();
        System.out.println("Instroduce fin: ");
        int fin = sc.nextInt();
        int[] nums = rellenaPares(longitud, fin);
        System.out.println(Arrays.toString(nums));

    }
}

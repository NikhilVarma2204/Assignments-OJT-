package Assignment1.ArmstrongRange;
import java.util.Scanner;
public class ArmstrongNumberRange {

    public int[] armstrongNumberInRange(int min, int max) {

        int start = min;
        int k = max;
        int temp;
        int sum;
        int a;
        int c = 0;
        int[] array = new int[100];

        for (int i =1; i <k; i++) {

            temp = i;
            sum = 0;
            while (temp != 0) {
                a = temp % 10;
                sum += a * a * a;
                temp /= 10;
            }

            if (i == sum) {

                array[c] = i;
                c++;
             

            }
        }

        return array;
    }
}
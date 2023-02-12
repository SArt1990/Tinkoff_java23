import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Scanner;
import org.apache.commons.lang3.ArrayUtils;
import java.lang.Character;
 
class Main {

    private static void check(Character[] arr, char f) 
    {
        boolean test
        = Arrays.asList(arr)
                .contains(f);
 
        // Print the result
        System.out.println("Is " + f
                           + " present in the array: " + test);
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        Character[] charObjectArray = ArrayUtils.toObject(arr);

        System.out.println();
        sc.close();
 
        System.out.println("Array: "
                           + Arrays.toString(arr));

        for (int i = 0; i < 10; i++)
        {
            char f = (char)(i + '0');
            check(charObjectArray, f);
        }
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class cmsc401 {
    public static void main (String args[]){
        int numGardens;
        int index = 0;
        int i = 0;
        int sum = 0;
        String input;
        Scanner in = new Scanner(System.in);

        numGardens = in.nextInt();
        in.nextLine();

        int[] array1 = new int[numGardens];
        int[] array2 = new int[numGardens];

        while(index < numGardens){
            input = in.nextLine();
            String[] num = input.split(" ");
            array1[i] = Integer.parseInt(num[0]);
            array2[i] = Integer.parseInt(num[1]);
            i++;
            index++;
        }

        for(int x = 0; x<array2.length; x++){
            sum += array2[x];
        }

        int[] combinedArray = new int[sum];
        int z =0;
        for(int x = 0; x < combinedArray.length; x++){
            for(int y = 0; y<array2[z] ; y++){

                z++;
            }
        }



    }

}

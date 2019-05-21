package countMaxValues;

import java.util.Arrays;

public class CountMaxValues {

    public void birthdayCakeCandles(int[] ar) {
        Arrays.sort(ar);
        int counterMaxValue = 0;
        for(int i : ar){
            if (i == ar[ar.length -1])
                counterMaxValue++;
        }
        System.out.println(counterMaxValue);
    }

    public static void main(String[] args) {
        CountMaxValues cmv = new CountMaxValues();
        cmv.birthdayCakeCandles(new int[] {1, 6, 2, 3, 4, 5, 6, 5, 6, 3, 3});
    }
}

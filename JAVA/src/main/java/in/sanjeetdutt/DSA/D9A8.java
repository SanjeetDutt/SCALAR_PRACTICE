package in.sanjeetdutt.DSA;

import java.util.ArrayList;

public class D9A8 {
    public int solve(ArrayList<Integer> A, int B) {

        // get prefix and suffx array
        // itterate from left and right to find max sum

        ArrayList<Integer> prefixSumArray = getSumArray(A, 0, A.size(), +1);
        ArrayList<Integer> suffixSumArray = getSumArray(A, A.size()-1, -1, -1);

        int maxSum = 0;

        for(int i = 0 ; i<=B; i++){
            int lIndex = i;
            int rIndex = A.size()-i-1;

            int currentSum = prefixSumArray.get(lIndex) + suffixSumArray.get(rIndex);

            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }

        return maxSum;


    }

    private ArrayList<Integer> getSumArray(ArrayList<Integer> array, int from, int to, int increment){

        int i = from;

        ArrayList<Integer> sumArray = new ArrayList<>();

        int sum = 0;

        while(i != to){
            sum += array.get(i);
            sumArray.add(sum);
            i+=increment;
        }



        return sumArray;

    }
}

package in.sanjeetdutt.DAY8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5 {

    public int solve(ArrayList<Integer> A) {

        ArrayList<Integer> prefixSum = getPrefixSum(A);

        ArrayList<Integer> suffixSum = getSufixSum(A);

        for(int i = 1; i<prefixSum.size(); i++){

            Integer LSum = prefixSum.get(i);
            Integer RSum = suffixSum.get(i);

            if(LSum == RSum)
                return i;
        }

        return -1;


    }

    private ArrayList<Integer> getPrefixSum(ArrayList<Integer> array){

        ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(0));

        for(int i = 1; i<array.size(); i++){

            Integer previousSum = answer.get(i-1);
            Integer previousValue = array.get(i-1);

            answer.add(previousSum + previousValue);

        }

        return answer;


    }

    private ArrayList<Integer> getSufixSum(ArrayList<Integer> array){

        ArrayList<Integer> suffixSum = new ArrayList<>(Arrays.asList(0));

        for(int i = 1; i< array.size(); i++){

            Integer previousSum = suffixSum.get(i-1);
            Integer previousValue = array.get(array.size()-i);

            suffixSum.add(previousSum + previousValue);

        }

        return suffixSum;


    }

}

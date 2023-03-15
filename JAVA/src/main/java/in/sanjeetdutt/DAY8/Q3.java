package in.sanjeetdutt.DAY8;

import java.util.ArrayList;

public class Q3 {

    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Integer> prefixSum = getPrefixSum(A);

        // index        =>  0 1 2 3  4
        // A            =>  1 2 3 4  5
        // prefixSum    =>  1 3 6 10 15

        ArrayList<Long> answers = new ArrayList<>();

        for(ArrayList<Integer> question : B){

            int startingIndex = question.get(0);
            int endingIndex = question.get(1);

            long answer = prefixSum.get(endingIndex).longValue();

            if(startingIndex > 0){
                answer -= prefixSum.get(startingIndex - 1).longValue();
            }

            answers.add(answer);

        }

        return answers;



    }

    private ArrayList<Integer> getPrefixSum(ArrayList<Integer> array){

        ArrayList<Integer> prefixSum = new ArrayList<>();

        Integer previousSum = 0;

        for(Integer i : array){
            previousSum += i;
            prefixSum.add(previousSum);
        }

        return prefixSum;

    }
}

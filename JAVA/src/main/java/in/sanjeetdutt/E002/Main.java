package in.sanjeetdutt.E002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Find count of sub array which are divisible by M
public class Main {

    public static double calculate(int[] array, int divisible) {

        Map<Integer, List<Integer>> remainderMap = generateRemainderMap(array,divisible);

        /** CONCEPT:
         * MAP:
         * 0 :5,10
         * 1 :6,11
         * 2 :2,7
         * 3 :8,
         * 4 :4,
         *
         * combination
         * 0,0 => 1
         * 1,4 => 2
         * 2,3 => 2
         *
         * total = 5
         */

        return countCombination(remainderMap,0, divisible);
    }

    private static double countCombination(Map<Integer, List<Integer>> remainderMap, int i, int divisible) {

        if(i > divisible / 2)
            return 0;

        int count = 0;

        if(i == 0){
            // return combination of 0's
            int zeroLength = remainderMap.get(0).size();
            count = (zeroLength * (zeroLength-1))/2;
        } else {
            count = remainderMap.get(i).size() * remainderMap.get(divisible-i).size();
        }

        return count + countCombination(remainderMap, i+1, divisible);

    }

    private static Map<Integer, List<Integer>> generateRemainderMap(int[] array, int divisible) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int value : array){

            int remainder = value % divisible;

            List<Integer> list = map.getOrDefault(remainder, new ArrayList<>());
            list.add(value);

            map.put(remainder,list);

        }

        return map;

    }

}

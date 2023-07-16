package in.sanjeetdutt.snippets.array;

/**
 * Given an int array = height of building, find water trap.
 * <a href="https://drive.google.com/file/d/1pOOl7bexrqCfNTQ9_B0p-wr9YXPLwKr1/view?usp=drive_link">SOLUTION</a>
 */
public class WaterTraped {
    int find(int[] buildingHeight){
        int[] maxOnLeft = getMaxHeightOnLeft(buildingHeight);
        int[] maxOnRight = getMaxHeightOnRight(buildingHeight);

        int waterStored = 0;

        for(int i = 0; i<buildingHeight.length; i++){
            int height = buildingHeight[i];

            int minOfMax = Integer.min(maxOnLeft[i],maxOnRight[i]);

            if(minOfMax - height > 0)
                waterStored += minOfMax - height;
        }

        return waterStored;
    }

    int[] getMaxHeightOnLeft(int[] buildingHeight) {
        int[] maxHeight = new int[buildingHeight.length];
        maxHeight[0] = 0;
        for(int i = 1; i<buildingHeight.length; i++){
            maxHeight[i] = Integer.max(buildingHeight[i-1],maxHeight[i-1]);
        }

        return maxHeight;
    }

    int[] getMaxHeightOnRight(int[] buildingHeight) {
        int N = buildingHeight.length;
        int[] maxHeight = new int[N];
        maxHeight[N-1] = 0;
        for(int i = N-2; i>=0; i--){
            maxHeight[i] = Integer.max(buildingHeight[i+1],maxHeight[i+1]);
        }

        return maxHeight;
    }
}

package in.sanjeetdutt.snippets.sorting.selectionAndMergeSort;

// Give an int array A. Count for all i < j, A[i] > A[j}
public class InversionCount {
    int[] array;
    // 4 5 1 2 6 3

    int count(int[] A){
        array = A;
        return sortAndCount(0, A.length-1); //s0

    }

    // This function will sort the array in given range [start,end] and will return Inversion counts
    int sortAndCount(int start,int end){
        // s0: start = 0, end = 5
        // s1: start = 0, end = 2
        // s2: start = 0, end = 1
        // s3: start = 0, end = 0
        // s4: start = 1, end = 1
        if (start > end) return 0;

        // s0: mid = 2
        // s1: mid = 1
        // s2: mid = 0
        // s3: mid = 0
        // s4: mid = 1
        int mid = start + (end - start)/2;

        int count = 0; // 0
        if (start != end){
            count += sortAndCount(start, mid); //s1 s2 s3=0
            count += sortAndCount(mid+1, end); //s4=0
        }

        if(start == end) return 0;

        // s2: start = 0, end = 1, mid=0
        int p1 = start; // p1 = 0
        int p2 = mid+1; // p2 = 1

        while (p1 <= mid && p2 <= end){
            if(array[p1] > array[p2]){
                // position is incorrect and needed to swap: todo
            }else{
                // else position is correct
            }


        }

        return count;

    }
}

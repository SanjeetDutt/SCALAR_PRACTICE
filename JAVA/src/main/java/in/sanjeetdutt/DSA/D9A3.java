package in.sanjeetdutt.DSA;

public class D9A3 {
    public int solve(String A) {

        int count = 0;
        int strLength = A.length();

        for(char letter : A.toCharArray()){

            if(isVowel(letter)){
                count = incrementCount(count,strLength);
            }

            strLength--;

        }

        return count;

    }

    private int incrementCount(int count, int increment){
        count += increment;
        return count % 10003;
    }

    private boolean isVowel(char letter){

        return (
                letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                        letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'
        );
    }
}

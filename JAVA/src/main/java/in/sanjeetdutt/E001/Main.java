package in.sanjeetdutt.E001;

//Finding value of  a^b % m

public class Main {

    public static double calculate(double a, double b, double m) {

        /** LOGIC :
         * a^b % m
         *
         * if b is even then
         * (a^2)^b/2 %m
         * (((a^2)%m)^b/2) %m
         * calculate((a^2)%m, b/2, m)
         *
         * else
         * a . (((a^2)%m)^(b-1)/2) %m
         * (a . calculate((a^2)%m, (b-1)/2, m))%m
         *
         * repeat
         *
         */

        // b = 0,1,2
        if(b < 3)
            return Math.pow(a,b) % m;

        if( b%2 == 0){
            return calculate((a*a)%m, b/2, m);

        } else {

            return (a * calculate((a*a)%m, (b-1)/2, m)) %m;

        }

    }


}

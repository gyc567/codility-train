package com.github.ericguo;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 11/21/2016.
 */
public class CarParking {
    public static int solution(String E, String L) {

        if (!E.contains(":")||!L.contains(":")) {
            return -1;
        }
        // write your code in Java SE 8
        String[] splitE = E.split(":");
        int hourE=Integer.valueOf(splitE[0]);
        int minuteE=Integer.valueOf(splitE[1]);

        String[] splitL = L.split(":");
        int hourL=Integer.valueOf(splitL[0]);
        int minuteL=Integer.valueOf(splitL[1]);

        if (hourL-hourE<0) {
            return -1;
        }

        int hh=hourL-hourE;
        if(hh<1)
        {
            return 2+3;
        }

        else {
            int rt=2+3;
            int hhLeftCost=hh-1;

            if(minuteL-minuteE<=0){

                return rt+hhLeftCost*4;
            }else
            {
                return rt+(hhLeftCost+1)*4;
            }

        }


    }
}

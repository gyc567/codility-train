package com.github.ericguo;

/**
 * Created by eric567 [email:gyc567@126.com]
 * on 11/21/2016.
 */
public class Dayticket {

    public  static int solution(int[] A) {
        // write your code in Java SE 8

        int length = A.length;
        int[] cost=new int[length +1];
        int idx7=0;
        int idx30=0;
        for (int i = 0; i < length; i++) {
            if(i==0)
            {
                cost[i]= 2;

            }
            else if(i>0&&A[i]-A[idx7]<6){
                int amout=cost[i-1]+2;
                cost[i]=amout;
            }else if(A[i]-A[idx7]==6)
            {
                int amout7=0;
                if(idx7==0)
                {amout7 =7;}
                else
                {
                    amout7+=cost[idx7];
                }
                idx7++;
                if(amout7<cost[i-1])
                {
                    cost[i]=amout7;
                }
            }else if(A[i]-A[idx30]==29)
            {

                int amout30=30 ;
                idx30++;
                if(amout30<cost[i-1])
                {
                    cost[i]=amout30;
                }
            }else
            {
                cost[i]=cost[i-1]+2;
            }


        }
        return cost[length];
    }
}

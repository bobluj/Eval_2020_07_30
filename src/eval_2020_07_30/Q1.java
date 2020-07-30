/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval_2020_07_30;

import java.util.Scanner;

/**
 *
 * @author jules.rachet
 */
public class Q1 {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] Tab = {12,12,11,10,9};
        int[][] Tab2;
        int Occur1;
        int Occur2;
        int i;
        int j;

        Occur1 = NbOccur(Tab,4 );
        Tab2 = FetchTab(Tab, 4);
        Occur2 = NbOccur(Tab2, 4);

        System.out.println(Occur1);
        System.out.println(Occur2);
    }
        public static int NbOccur(int[] Tab, int n)
    {
        int i;
        int count;

        count = 0;

        for(i = 0; i< Tab.length; i++)
        {
             if (n == Tab[i])
                count++;
        }
        return(count);
    }

       public static int NbOccur(int[][] Tab, int n)
    {
        int i;
        int j;
        int occur;

        for (i = 0; i < Tab.length; i++)
        {
            for (j = 0; j < 2; j++)
            {
               if (Tab[i][0] == n)
               {
                   occur = Tab[i][1];
                    return(occur);
               }
            }
        }
        return 0;
    }

        public static int[][] FetchTab(int[] Tab,int n)
    {
        int i;
        int j;
        int[][] TabConcat = new int[Tab.length][Tab.length];

        for (i = 0; i < Tab.length; i++)
        {
             TabConcat[i][0] = Tab[i];
        }
        for (i = 0; i < Tab.length; i++)
        {
            TabConcat[i][1] = NbOccur(Tab, n);
        }
                   return(TabConcat);
    }
}

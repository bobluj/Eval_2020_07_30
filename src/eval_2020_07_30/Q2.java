/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval_2020_07_30;

/**
 *
 * @author jules.rachet
 */
public class Q2 {

   public static void main(String[] args) {
       String pol = "kayak";
        EstPalindrome(pol);
    }

    public static boolean EstPalindrome(String Mot)
    {
        int NbLettre;
        NbLettre = Mot.length();

        for (int i = 0; i != NbLettre/2; i++)
        {
            if (Mot.charAt(i) != Mot.charAt(NbLettre - i))
                return(false);
        }
            return(true);
    }

    public static int Nbpld(String[] Liste)
        {
            int i;
            i = 0;


            while (EstPalindrome(Liste[i]) == true && i != Liste[i].length())
            {
                i++;
            }
            return(i);
        }
}


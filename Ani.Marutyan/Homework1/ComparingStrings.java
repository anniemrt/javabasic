
import java.util.Scanner;

/**
 * Created by Ani.Marutyan on 4/15/2015.
 */
public class StringComparison {

    public static boolean CompareStrings ( String first_string, String second_string ){
        
        if (first_string.length() == second_string.length()){
            char [] first_array = first_string.toUpperCase().toCharArray();
            char [] second_array = second_string.toUpperCase().toCharArray();
            int i = 0;
            while ( i < first_array.length ) {
                if (first_array[i] == second_array[i])
                    i++;
                else break;
            }
    
            if ( i == first_array.length )
                return true;
                
        else
            return false;
        }
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        String st1;
        String st2;
        System.out.println("Please input the first character string: ");
        st1 = "asd";
        System.out.println("And the second one: ");
        st2 = "asd";
        
      	
        if (st1 == st2 || CompareStrings (st1, st2))
            System.out.println("The strings match");
        else
            System.out.println("The strings don't match");

    }



}

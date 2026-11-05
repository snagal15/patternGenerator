// Project by Siddhant Nagalia for AP CSA
// Date 10/28/26- 11/5/26
// Program description: this program prints out five different patterns of stars, numbers, and letters based on user input, utilizing for loops, do loops, and while loops.

public class patternGenerator {

    public static void stars(int rows) {
        
        int i = 1;

        while (i <= rows) {
            int j = 1;

            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }
    }

    public static void triangle(int rows) {
        
        int i = 1;

        do {
            int j = 1;

            do {
                System.out.print(i);
                j++;
                
            } while (j <= i);

            System.out.println();
            i++;

        } while (i <= rows);
    }

    public static void odds(int start) {
        
        for (int i = start; i >= 1; i -= 2) {
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print(i);
            }

            System.out.println();
        }
    }

    public static void eo(int maxE) {
        
        char letter;

        if (maxE % 2 == 0) {
            letter = 'O';
        
        } else {
            letter = 'E';
        }

        for (int i = 1; i <= maxE; i++) {
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print(letter);
            }

            System.out.println();

            if (letter == 'O') {
                letter = 'E';
           
            } else {
                letter = 'O';
            }
        }

        if (letter == 'O') {
            letter = 'E';
       
        } else {
            letter = 'O';
        }

        for (int i = maxE - 1; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print(letter);
            }

            System.out.println();

            if (letter == 'O') {
                letter = 'E';
            
            } else {
                letter = 'O';
            }
        }
    }


    public static void pyramid(int rows) {
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print the row number
            for (int j = 1; j <= 2 * (rows - i) + 1; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }

    
    public static void main(String[] args) {

// Test section : D 

        stars(7);

        triangle(9);


        odds(9);


        eo(6);


        pyramid(5);
    }
}

// Thanks for playing.

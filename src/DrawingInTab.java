import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class DrawingInTab {
    public static void main(String[] args) {
        //int [] [] tablica2 = new int [6][6];
        //int[][] tablica;
        char[][] tablica2 = new char[6][6];
        int l = 0;

               /* {0    1    2    3    4    5
               0 {'*', ' ', ' ', ' ', ' ', ' '},
               1 {' ', '*', ' ', ' ', ' ', ' '},
               2 {' ', ' ', '*', ' ', ' ', ' '},
               3 {' ', ' ', ' ', '*', ' ', ' '},
               4 {' ', ' ', ' ', ' ', '*',' ',},
               5 {' ', ' ', ' ', ' ', ' ', '*'}};*/


        int[][] tablica = new int[6][];
        tablica[0] = new int[1];
        tablica[1] = new int[2];
        tablica[2] = new int[3];
        tablica[3] = new int[4];
        tablica[4] = new int[5];
        tablica[5] = new int[6];


        // TODO: 2019-02-03 przekątna poniżej
        /* for(int i=0; i<tablica2.length; i++){
            for (int j = 0; j < tablica2[i].length; j++)
                if(i==j) {
                    tablica2[i][j] = '*';
                } else tablica2[i][j] = ' ';
        }*/

        // TODO: 2019-02-03 drzewka zaleznie od znaków warunkowych
        /*for(int i=0; i<tablica2.length; i++){
            for (int j = 0; j < tablica2[i].length; j++)
                if(i<=j) {
                    tablica2[i][j] = '*';
                } else tablica2[i][j] = ' ';
        }*/

       /* for (int i = 0; i < tablica2.length; i++) {
            for (int j = 0; j < tablica2[i].length; j++)
                if (i >= j) {
                    tablica2[i][j] = '*';
                } else tablica2[i][j] = ' ';
        }*/
        // TODO: 2019-02-03 krzyzyk
/*        for (int i = 0; i < tablica2.length; i++) {
            for (int j = 0; j < tablica2[i].length; j++)
                if (i==j || i + j == 5) {
                    tablica2[i][j] = '*';
                } else tablica2[i][j] = ' ';

        }*/
        // TODO: 2019-02-03 kwadrat
        for (int i = 0; i < tablica2.length; i++) {
            for (int j = 0; j < tablica2[i].length; j++)
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    tablica2[i][j] = '*';
                } else tablica2[i][j] = ' ';

        }


        for (int i = 0; i < tablica2.length; i++) {
            for (int j = 0; j < tablica2[i].length; j++)
                System.out.print(tablica2[i][j]);
            System.out.println();

        }

        new ArrayList<>(Arrays.asList(tablica2));

    }
}

import java.util.Scanner;

public class Matrix {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size:");
        int matrix_size = sc.nextInt();

        for (int i=0; i<matrix_size; ++i)
        {
            for(int j=0; j<matrix_size; ++j)
            {
                if (i==j | i+j==matrix_size-1){ System.out.print(1 + " ");}
                else {System.out.print(0+ " ");}
            }
            System.out.println();
        }

    }

}


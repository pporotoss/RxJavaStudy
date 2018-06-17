package gugudan;

import java.util.Scanner;

public class Gugudan {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gugudan Input:");
        int dan = Integer.parseInt(scanner.nextLine());
        for (int row = 1; row <= 9; row++) {
            System.out.println(dan + " * " + row + " = "+ (dan * row));
        }
    }
    
}

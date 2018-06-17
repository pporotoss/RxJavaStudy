package gugudan;

import io.reactivex.Observable;

import java.util.Scanner;

public class Gugudan {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gugudan Input:");
        final int dan = Integer.parseInt(scanner.nextLine());
    
        Observable<Integer> source = Observable.range(1, 9);
        source.subscribe(row -> System.out.println(dan + " * " + row + " = " + (dan*row)));
    }
    
}

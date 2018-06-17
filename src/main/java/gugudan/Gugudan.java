package gugudan;

import io.reactivex.Observable;

import java.util.Scanner;

public class Gugudan {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gugudan Input:");
        final int dan = Integer.parseInt(scanner.nextLine());
    
        Observable<String> source = Observable.just(dan)
                                            .flatMap(num ->
                                                    Observable.range(1, 9)
                                                                .map(row -> num + " * " + row + " = " + (num * row))
                                            );
        source.subscribe(System.out::println);
    }
    
}

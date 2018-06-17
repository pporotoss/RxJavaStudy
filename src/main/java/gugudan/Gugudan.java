package gugudan;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

import java.util.Scanner;

public class Gugudan {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gugudan Input:");
        final int dan = Integer.parseInt(scanner.nextLine());
    
        Function<Integer, Observable<String>> gugudan = num -> {
            Observable<String> observable = Observable.range(1, 9).map(row -> dan + " * " + row + " = " + (dan * row));
            return observable;
        };
        
        Observable<String> source = Observable.just(dan).flatMap(gugudan);
        source.subscribe(System.out::println);
    }
    
}

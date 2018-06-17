package gugudan;

import io.reactivex.Observable;

import java.util.Scanner;

public class Gugudan {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gugudan Input:");
        final int dan = Integer.parseInt(scanner.nextLine());
        
        // map() 과 flatMap() 의 가장 큰 차이는 Observable로 리턴 여부 이다.
        // flatMap()은 Observable을 리턴한다.
        Observable<String> source = Observable.just(dan)
                .flatMap(
                        num -> Observable.range(1, 9)
                        , (num, row) -> num + " * " + row + " = " + (num * row)
                );
        source.subscribe(System.out::println);
    }
    
}

package query;

import io.reactivex.Maybe;
import io.reactivex.Observable;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

public class QueryTvSales {
    
    public static void main(String[] args) {
        
        List<Pair<String, Integer>> sales = new ArrayList<>();
    
        sales.add(Pair.of("TV", 2500));
        sales.add(Pair.of("Camera", 300));
        sales.add(Pair.of("TV", 1600));
        sales.add(Pair.of("Phone", 800));
    
        Maybe<Integer> tvSales = Observable.fromIterable(sales)
                .filter(sale -> "TV".equals(sale.getLeft())) // TV만 필터링
                .map(sale -> sale.getRight()) // 숫자값만 추출
                .reduce((sale1, sale2) -> sale1 + sale2); // 전체 합산
        
        tvSales.subscribe(total -> System.out.println("TV sales : $" + total));
    }
    
}

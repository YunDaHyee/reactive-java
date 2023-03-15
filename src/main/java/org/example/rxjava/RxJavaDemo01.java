package org.example.rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;

public class RxJavaDemo01 {
    public static void main(String[] args) {
        List<String> favoriteColors = Arrays.asList("red", "blue", "pink", "brown", "w", "ab");

//        Observable<String> stringObservable = Observable.fromIterable(favoriteColors);
//        stringObservable.subscribe(item -> System.out.println(item));

        Observable.fromIterable(favoriteColors)
                .map(c -> c.toUpperCase())     // Observable<String>
                .filter(c -> c.length() >= 4)  // Observable<String>
                .subscribe(item -> {
                    item.toLowerCase();

                });
    }
}

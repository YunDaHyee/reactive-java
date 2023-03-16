package org.example.rxjava.combine;

import io.reactivex.rxjava3.core.Observable;

public class Combine_11_Concat {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma");
        source.concatMap(s -> Observable.fromArray(s.split("")))
              .subscribe(System.out::println);
    }
}
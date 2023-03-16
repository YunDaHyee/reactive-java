package org.example.rxjava.combine;

import io.reactivex.rxjava3.core.Observable;

public class Combine_05_Merging {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma");
        source.flatMap(s -> Observable.fromArray(s.split("")))
                .subscribe(System.out::println);
    }
}
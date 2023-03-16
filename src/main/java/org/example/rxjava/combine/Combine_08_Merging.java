package org.example.rxjava.combine;

import io.reactivex.rxjava3.core.Observable;

public class Combine_08_Merging {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .flatMap(s -> Observable.fromArray(s.split("")),
                        (s, r) -> s + "-" + r)
                .subscribe(System.out::println);
    }
}
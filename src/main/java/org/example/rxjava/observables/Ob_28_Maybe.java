package org.example.rxjava.observables;

import io.reactivex.rxjava3.core.Observable;

public class Ob_28_Maybe {
    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta");
        source.firstElement()
                .subscribe(s -> System.out.println("RECEIVED " + s),
                        e -> System.out.println("Error captured: " + e),
                           () -> System.out.println("Done!")
                );
    }
}
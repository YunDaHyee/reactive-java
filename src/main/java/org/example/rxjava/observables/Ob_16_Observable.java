package org.example.rxjava.observables;

import io.reactivex.rxjava3.core.Observable;

public class Ob_16_Observable {
    public static void main(String[] args) {
        Observable<String> empty = Observable.empty();
        empty.subscribe(System.out::println,
                Throwable::printStackTrace,
                () -> System.out.println("Done!"));
    }
}
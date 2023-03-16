package org.example.rxjava.observables;

import io.reactivex.rxjava3.core.Observable;

public class Ob_22_Observable {
    public static void main(String[] args) {
        Observable.just(1 / 0)
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        e -> System.out.println("Error captured: " + e));
    }
}
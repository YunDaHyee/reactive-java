package org.example.rxjava.observables;

import io.reactivex.rxjava3.core.Observable;

public class Ob_12_Observable {
    public static void main(String[] args) {
        Observable.range(5, 3)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}
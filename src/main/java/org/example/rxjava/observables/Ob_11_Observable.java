package org.example.rxjava.observables;

import io.reactivex.rxjava3.core.Observable;

public class Ob_11_Observable {
    public static void main(String[] args) {
        Observable.range(1, 3)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}
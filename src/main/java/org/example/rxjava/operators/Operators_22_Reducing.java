package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_22_Reducing {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .count()
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
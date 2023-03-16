package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_21_Mapping {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .scan(0, (total, next) -> total + 1)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
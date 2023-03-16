package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_50_Action {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .doAfterNext(s -> System.out.println("After: " + s))
                .map(String::length)
                .subscribe(i -> System.out.println("Received: " + i));
    }
}
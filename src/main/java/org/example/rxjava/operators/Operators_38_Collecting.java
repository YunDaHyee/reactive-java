package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_38_Collecting {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .toMultimap(String::length)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
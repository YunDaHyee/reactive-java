package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_09_Filtering {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .map(String::length)
                .distinct()
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}
package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_31_Collecting {
    public static void main(String[] args) {
        Observable.range(1, 1000)
                .toList(1000)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
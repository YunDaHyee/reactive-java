package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_23_Reducing {
    public static void main(String[] args) {
        Observable.just(5, 3, 7)
                .reduce((total, i) -> total + i)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
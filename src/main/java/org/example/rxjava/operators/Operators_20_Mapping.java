package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_20_Mapping {
    public static void main(String[] args) {
        Observable.just(5, 3, 7)
                .scan((accumulator, i) -> accumulator * i)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
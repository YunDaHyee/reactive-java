package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_17_Mapping {
    public static void main(String[] args) {
        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                .sorted()
                .subscribe(System.out::print);
    }
}
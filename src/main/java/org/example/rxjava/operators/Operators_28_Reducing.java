package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_28_Reducing {
    public static void main(String[] args) {
        Observable.range(1, 10000)
                .contains(9563)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
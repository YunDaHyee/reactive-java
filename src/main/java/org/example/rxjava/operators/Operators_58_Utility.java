package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_58_Utility {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .repeat(2)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
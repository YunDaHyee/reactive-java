package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_13_Filtering {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Zeta", "Eta", "Gamma")
                .elementAt(3)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}
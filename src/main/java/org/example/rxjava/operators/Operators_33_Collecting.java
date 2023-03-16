package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_33_Collecting {
    public static void main(String[] args) {
        Observable.just("Beta", "Gamma", "Alpha")
                .toSortedList()
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
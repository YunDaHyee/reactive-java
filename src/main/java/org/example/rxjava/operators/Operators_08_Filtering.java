package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_08_Filtering {
    public static void main(String[] args) {
        Observable.range(1, 100)
                .skip(90)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}
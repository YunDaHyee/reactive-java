package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_24_Reducing {
    public static void main(String[] args) {
        Observable.just(5, 3, 7)
                .reduce("", (total, i) -> total + (total.equals("") ? "" : ",") + i)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
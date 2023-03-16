package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_60_Utility {
    public static void main(String[] args) {
        Observable.just("One", "Two", "Three")
                .filter(s -> s.contains("z"))
                .single("Four")
                .subscribe(i -> System.out.println("Received: " + i));
    }
}
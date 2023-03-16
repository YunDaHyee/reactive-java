package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_59_Utility {
    public static void main(String[] args) {
        Observable.just("One")
                .single("Four")
                .subscribe(i -> System.out.println("Received: " + i));
    }
}

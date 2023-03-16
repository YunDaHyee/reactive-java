package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_27_Reducing {
    public static void main(String[] args) {
        Observable.just("One", "Two", "Three")
                  .filter(s -> s.contains("z"))
                  .isEmpty()
                  .subscribe(s -> System.out.println("Received1: " + s));

        Observable.just("One", "Twoz", "Three")
                .filter(s -> s.contains("z"))
                .isEmpty()
                .subscribe(s -> System.out.println("Received2: " + s));
    }
}

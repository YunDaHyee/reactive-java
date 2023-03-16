package org.example.rxjava.observables;

import io.reactivex.rxjava3.core.Single;

public class Ob_25_Single {
    public static void main(String[] args) {
        Single.just("Hello!")
                .map(String::length)
                .subscribe(System.out::println,
                        e -> System.out.println("Error captured: " + e));
    }
}
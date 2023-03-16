package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_02_Conditional {
    public static void main(String[] args) {
        Observable.range(1, 100)
                .skipWhile(i -> i <= 95)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}
package org.example.rxjava.observables;

import io.reactivex.rxjava3.core.Observable;

public class Ob_26_Single {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("Alpha", "Beta");
        source.first("Nil") //returns a Single
                .subscribe(System.out::println);
    }
}
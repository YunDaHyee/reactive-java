package org.example.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class ColdObservableDemo {
    public static void main(String[] args) {
        Observable<String> stringObservable = Observable.just("a", "b", "c");

        stringObservable.subscribe(System.out::println);
        stringObservable.subscribe(System.out::println);

    }
}

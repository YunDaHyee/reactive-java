package org.example.rxjava;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

public class HotObservableDemo {
    public static void main(String[] args) {
        ConnectableObservable<String> source =
                Observable.just("Alpha", "Beta", "Gamma").publish();
        //Set up observer 1
        source.subscribe(s -> System.out.println("Observer 1: " + s));
        //Setup observer 2
        source.map(s -> s.length())
                .subscribe(i -> System.out.println("Observer 2: " + i));
        //Fire!
        source.connect();

    }
}

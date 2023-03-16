package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;

public class Operators_61_Utility {
    public static void main(String[] args) {
        Observable.just("One", "Two", "Three")
                .timestamp(TimeUnit.SECONDS)
                .subscribe(i -> System.out.println("Received: " + i));
    }
}

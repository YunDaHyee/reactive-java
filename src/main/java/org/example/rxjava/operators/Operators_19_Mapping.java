package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;
import java.util.Comparator;

public class Operators_19_Mapping {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .sorted(Comparator.comparingInt(String::length))
                .subscribe(System.out::println);
    }
}
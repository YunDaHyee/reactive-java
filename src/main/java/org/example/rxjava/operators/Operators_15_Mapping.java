package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_15_Mapping {
    public static void main(String[] args) {
        Observable<String> menu =
                Observable.just("Coffee", "Tea", "Espresso", "Latte");
       //print menu
        menu.startWithItem("COFFEE SHOP MENU")
                .subscribe(System.out::println);
    }
}
package org.example.rxjava;

import io.reactivex.rxjava3.core.Observable;

public class RxJavaRangeDemo {
    public static void main(String[] args) {
        Observable.rangeLong(5, 200000000000000L)
                .subscribe(item -> System.out.println(item));
    }
}

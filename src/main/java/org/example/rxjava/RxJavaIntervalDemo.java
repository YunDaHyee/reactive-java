package org.example.rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class RxJavaIntervalDemo {
    public static void main(String[] args) throws InterruptedException {
        Observable.interval(500, TimeUnit.MILLISECONDS)
                .subscribe(System.out::println);
        Thread.sleep(5000);
    }
}

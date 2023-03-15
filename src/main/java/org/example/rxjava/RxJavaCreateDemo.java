package org.example.rxjava;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

import java.util.concurrent.Callable;

public class RxJavaCreateDemo {
    public static void main(String[] args) {
        Observable<String> oo = Observable.create(emitter -> {
            emitter.onNext("kim");
            emitter.onNext("Lee");
            emitter.onNext("park");
            emitter.onNext("whang");
            emitter.onNext("kwon");
            emitter.onComplete();
        });
        //...
        //...
        //...
        oo.subscribe(System.out::println);

        Observable<String> oo2 = Observable.fromCallable(new MyCallable());
        oo2.subscribe(System.out::println);
    }
}

class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Hello";
    }
}

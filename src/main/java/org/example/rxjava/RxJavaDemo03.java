package org.example.rxjava;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class RxJavaDemo03 {
    public static void main(String[] args) {
        // Observable --> Observer
        Observable.just("a", "b", "c", "d")
                .subscribe(new MyObserver());
    }
}

class MyObserver implements Observer<String> {
    private Disposable disposable;
    @Override
    public void onSubscribe(@NonNull Disposable d) {
        this.disposable = d;
        System.out.println("데이터 구독 합니다.");
    }
    @Override
    public void onNext(@NonNull String s) {
        if (s.equals("c")) {
            disposable.dispose();
            System.out.println("구독취소");
            return;
        }
        System.out.println("데이터 사용 : " + s);
    }
    @Override
    public void onError(@NonNull Throwable e) {
        System.out.println("에러 발생 했어요.. " + e);
    }
    @Override
    public void onComplete() {
        System.out.println("데이터 전송 완료..");
    }
}

package org.example.rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RxJavaDemo02 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("kim", "lee", "park", "kwon", "hwang");

        // 1. 리액티브 하게 데이터를 처리하는 라이브러리 - RxJava
        // 2. RxJava로 데이터 처리하는 방식
        //    데이터 소스와 데이터 사용하는 부분을 분리 (데이터 소스.. Observable, Flowable(back pressure 기능 포함))
        //    연산자를 파이프라인 형태로 사용 가능

        Observable.fromIterable(stringList)  // Observable<String>
                .filter(item -> item.length() >= 4)
                .map(item -> item.toUpperCase())
                .take(100)
                .subscribe(
                        item -> System.out.println(item),
                        err -> System.out.println(err),
                        () -> System.out.println("데이터 전송 완료.."));


        // 기존 방식.. 글자수가 4글자 이상인 데이터를 대문자로 변경해서 화면에 출력한다.
        // 작업 .. 1. 4글자 이상 데이터 필터링, 2. 데이터를 대문자로 변경(매핑), 3. 데이터를 사용(화면출력)
        List<String> resultList = new ArrayList<>();
        for (String item : stringList) {
            if (item.length() >= 4) {
                resultList.add(item.toUpperCase());
            }
        }

        for (String item : resultList) {
            System.out.println(item);
        }

    }
}

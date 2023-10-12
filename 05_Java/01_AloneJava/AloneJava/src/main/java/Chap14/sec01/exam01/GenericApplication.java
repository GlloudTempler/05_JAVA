package Chap14.sec01.exam01;

import java.util.ArrayList;

/**
 * packageName : Chap14.sec01.exam01
 * fileName : GenericApplication
 * author : GGG
 * date : 2023-09-27
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-27         GGG          최초 생성
 */
public class GenericApplication {
    public static void main(String[] args) {
//        TODO: 여기부터 코딩
//        TODO : 제네릭 : 향상된배열에서 자료를 추가할 때 자료형을 제한하는 것을 의미
//               사용법 : List<제한할자료형> list  = new ArrayList<>();
//                 부모 : Product, 자식 : TV, Audio클래스
        ArrayList<Product> productArrayList = new ArrayList<>();
        ArrayList<Tv> tvArrayList = new ArrayList<>();
//        TODO 1) 아래 에러
//        ArrayList<Product> tvArrayList = new ArrayList<Tv>();
//        TODO 2) productArrayList : 부모 클래스 배열에 자식 넣기?
        productArrayList.add(new Tv()); // 0
        productArrayList.add(new Audio()); // 0
//        TODO 3) tvArrayList : 당연히 Tv객체만 qodufdp cnrk rksmd
        tvArrayList.add(new Tv());

        System.out.println("----함수의 매개변수에 제네릭 사용----");
        printAll(productArrayList);
//        TODO : 에러 발생 : 부모라도 자식클래스는 안됨 : 대상 클래스만 가능
//               printAll(tvArrayList);
        System.out.println("---- 제네릭의 특수한 형태 ----");
        System.out.println("---- <? extend TV> ----");
//        TODO : <?extends Tv> : Tv의 자식 클래스만 가능
        printAll2(tvArrayList); //0
//        printAll2(productArrayList); // x(부모 안됨)
        System.out.println("----<? super Product> ----");
//        TODO : <? super Product> : Product 부모 클래스만 가능함(자식x)
        printAll3(productArrayList); // o
//        printAll3(tvArrayList); // x (자식 안됨)
        System.out.println("---- <?> ----");
//        TODO : <?> : 모든 자료형이 가능
        printAll4(productArrayList); // o
        printAll4(tvArrayList); // o

    }


    public static void printAll(ArrayList<Product> list) {
        for(Object p : list) {
            System.out.println(p);
        }
    }

    public static void printAll2(ArrayList<? extends Tv> list) {
        for(Object p : list) {
            System.out.println(p);
        }
    }

    public static void printAll3(ArrayList<? super Product> list) {
        for(Object p : list) {
            System.out.println(p);
        }
    }

    public static void printAll4(ArrayList<?> list) {
        for(Object p : list) {
            System.out.println(p);
        }
    }
}

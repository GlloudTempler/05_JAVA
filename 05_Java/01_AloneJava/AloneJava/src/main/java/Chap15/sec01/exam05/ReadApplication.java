package Chap15.sec01.exam05;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName : Chap15.sec01.exam05
 * fileName : ReadApplication
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
public class ReadApplication {
    public static void main(String[] args) throws Exception{
//        TODO : 파일 읽기(입력)용으로 접근
        InputStream inputStream =
                new FileInputStream("src/main/resources/test2.db");
//        TODO : 성능 향상 : 1byte -> 여러byte씩 한번에 읽기
        byte[] buffer = new byte[100];
//        TODO : 무한반복문
        while(true) {
//            TODO : 파일 읽기 : buffer(배열크기많큼)
//                   =>buffer : 파일에서 읽은 내용이 저장
//                   => 리턴 : 파일에서 읽은 byte수가 리턴됨, 파일의 끝 : -1
            int data = inputStream.read(buffer);
            if(data == -1) break;
//            TODO : 읽은 내용 화면 출력
            System.out.println(Arrays.toString(buffer));
        }
//        TODO : 파일 닫기
        inputStream.close();
    }
}

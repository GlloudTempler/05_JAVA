package Chap15.sec02.exam02;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.nio.Buffer;

/**
 * packageName : Chap15.sec02.exam02
 * fileName : ReadLineApplication
 * author : GGG
 * date : 2023-09-27
 * description : 보조스트림 : 라인단위로 화면에 출력 + 성능향상
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-27         GGG          최초 생성
 */
public class ReadLineApplication {
    public static void main(String[] args) throws Exception{
//        TODO : 문자기반(char) 파일 읽기용으로 접근
        Reader reader = new FileReader("src/main/resources/language.txt");

//        TODO : 보조스트림 : new 보조스트림(기본스트림)
        BufferedReader bufferedReader = new BufferedReader(reader);
//        TODO : BufferedReader 클래스 : .readLine() : 1줄씩 읽기
        while(true) {
            String data = bufferedReader.readLine(); // 1줄씩 읽기
//            TODO : 파일의 끝 : null
            if(data == null) break;
            System.out.println(data); // 화면 출력
        }
    }
}

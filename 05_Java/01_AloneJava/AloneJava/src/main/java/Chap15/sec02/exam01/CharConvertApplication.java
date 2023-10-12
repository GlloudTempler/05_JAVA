package Chap15.sec02.exam01;

import Chap15.sec01.exam04.ReadApplication;

import java.io.*;

/**
 * packageName : chap14.sec02.exam01
 * fileName : CharConvertApplication
 * author : ds
 * date : 2022-10-07
 * description : 자식클래스 : 보조스트림( 문자 변환 보조 스트림 )
 * 요약 :
 *       보조스트림 : 다른 스트림과 연결되어 편리한 추가 기능을 제공해주는 객체
 *       ex) 문자 변환, 입출력속도향상, 객체 직렬화 등
 *       기능 추가 방법 : new 보조스트림클래스(기본스트림클래스)
 *       => 디자인 패턴 : 데코레이션 패턴
 *       => ex) new 보조스트림클래스2(보조스트림클래스1(기본스트림클래스))
 *       1) 문자 변환 : 소스파일이 byte기반 입출력 파일인데 문자 기능 추가
 *           => OutputStreamWriter, InputStreamReader
 *       2) 성능 향상 : 기본적으로 제공하는 버퍼는 크기가 작음
 *           => BufferedOutputStream / BufferedInputStream
 *       3) 기본자료형 입출력 : InputStream / OutputStream 1 byte, char
 *           => DataInputStream/DataOutputStream
 *           => 기본자료형 int, double, String 자료형을 사용해서 입출력 할 수 있음
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-07         ds          최초 생성
 */
public class CharConvertApplication {
    public static void write(String str) throws Exception {
//        TODO : 파일 쓰기용 파일생성
        FileOutputStream fos = new FileOutputStream("src/main/resources/test1.txt");

//        TODO : 보조 스트림 사용 : 문자기반 객체로 변환 : new 보조스트림(기본스트림)
        Writer writer = new OutputStreamWriter(fos);
//        TODO : 파일에(버퍼) 쓰기
        writer.write(str);
        writer.flush();
        writer.close();
    }

    public static String read() throws Exception {
//        TODO : 여기부터 코딩
//        TODO : 파일 읽기용으로 접근
        FileInputStream fileInputStream =
                new FileInputStream("src/main/resources/test1.txt");

//        TODO : 보조스트림기능 더하기 : new 보조스트림(기본스트림)
        Reader reader = new InputStreamReader(fileInputStream);
//        TODO : 속도향상 : 배열만들기
        char[] buffer = new char[100];
//        TODO : 파일 읽기
        int readNum = reader.read(buffer);
        reader.close();

//      TODO: char[] -> String 바꾸기
        String data = new String(buffer, 0, readNum);

        return data;
    }

    public static void main(String[] args) throws Exception{
//        TODO: 여기부터 코딩
//        파일쓰기 함수 호출
        write("문자 변환 스트림을 사용합니다.");
//        파일 읽기 함수 호출
        String data = read();
        System.out.println(data); // 화면 출력
    }
}








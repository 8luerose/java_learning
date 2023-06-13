import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {
    public static void main(String[] args) throws IOException { //예외 throws처리
        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.write("Hello 1");
        p1.close();

        PrintWriter p2 = new PrintWriter("result2.txt");
        p2.write("Hello 2");
        p2.close();

        //자 이게 무슨 얘기냐? =인스턴스란?
        //1. PrintWriter라고 하는 Class를 new로 복제한다
        //2. p1이라는 그릇에 담는다
        //3. 이때 p1은 PrintWriter라는 Class 객체틀 이다

        //따라서, p1은 PrintWriter라는 객체틀 이며, 새로운 생명을 불어넣기 위해
        //PrintWriter p1 = new PrintWriter() 이렇게 '인스턴스'해준 것이다

        //+Constructor 가 존재한다면, 이 클래스를 이용해서 '인스턴스' 하는 것이 허용된다는 뜻
        //Constructor = new 'PrintWriter()' = new + Constructor
    }
}

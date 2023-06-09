import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

import javax.swing.*;

public class OkJavaGoInHomeInput {
    public static void main(String[] args){

        String id = JOptionPane.showInputDialog("Enter a ID");
        //JOptionPane: sout처럼 기본 상태는 아니다-> 따라서 import한다
        //JOptionPane은 javax.swing.JOptionPane 클래스를 import 하면 된다
        //swing은 showInputDialog()을 지원한다. = 대화상자 출력
        String bright = JOptionPane.showInputDialog("Enter a Bright level");
        //DimmingLights moodLamp의 .setBright()에 들어갈 인자

        Elevator myElevator = new Elevator(id);
        //원래 org.opentutorials.iot.Elevator; 였으나 import 후에 'Elevator'로 데이터 타입을 정의 가능
        //JAVA 아파트 507호에 살고있다.(엘레베이터 위치)
        //형식: 데이터타입 변수 = new 데이터타입(매개변수 = id = "JAVA APT 507")

        myElevator.callForUp(1);
        //나 엘레베이터 타고 '올라갈건데' 1층으로 보내 -> 엘레베이터에게.호출

        Security mySecurity = new Security(id);
        //어디에 시큐리티 설정할건데(시큐리티 위치)

        mySecurity.off();
        //.off() = 메소드

        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        //JAVA APT 507호에 있는 Hall Lamp
        hallLamp.on();

        Lighting floorLamp = new Lighting(id + " / floorLamp");
        //JAVA APT 507호에 있는 floorLamp
        floorLamp.on();

        DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();
        //DimmingLights = 밝기 조절 램프
        //DimmingLights 클래스는 setBright(n%) 밝기 조절 가능
        //setBright()는 double 자료형 인자가 필요한데, String bright 임
        //따라서 String bright 를 Double.parseDouble(bright)로 컨버팅 해준다
        //즉, String bright -> Double.parseDouble(bright) -> double bright
    }
}

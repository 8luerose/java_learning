import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
public class OkJavaGoInHome {
    public static void main(String[] args){

        String id = "JAVA APT 507";

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
    }
}

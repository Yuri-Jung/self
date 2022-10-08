package chap05;

public class Car5 {
    Tire5 frontLeftTire = new Tire5("앞왼쪽",6);
    Tire5 frontRightTire = new Tire5("앞오른쪽",2);
    Tire5 backLeftTire = new Tire5("뒤왼쪽", 3);
    Tire5 backRightTire = new Tire5("뒤오른쪽",4);

    int run(){
        System.out.println("[자동차가 달립니다.]");
        if(frontLeftTire.roll()==false){
            stop();
            return 1;
        }
        if(frontRightTire.roll()==false){
            stop();
            return 2;
        }
        if(backLeftTire.roll()==false){
            stop();
            return 3;
        }
        if(backLeftTire.roll()==false){
            stop();
            return 4;
        }
        return 0;
    }

    void stop(){
        System.out.println("[자동차가 멈춥니다.]");
    }
}

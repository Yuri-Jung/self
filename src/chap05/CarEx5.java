package chap05;

public class CarEx5 {
    public static void main(String[] args) {
        Car5 car5 = new Car5();

        for(int i=1; i<=5; i++){
            int problemLocation = car5.run();

            switch (problemLocation){
                case 1 :
                    System.out.println("앞왼쪽 한국타이어로 교체");
                    car5.frontLeftTire = new HankookTire5("앞왼쪽",15 );
                    break;

                case 2:
                    System.out.println("앞오른쪽 금호타이어로 교체");
                    car5.frontRightTire = new KumhoTire5("앞오른쪽" , 13);
                    break;

                case 3:
                    System.out.println("뒤왼쪽 한국타이어로 교체");
                    car5.backLeftTire = new HankookTire5("뒤왼쪽",14);
                    break;

                case 4:
                    System.out.println("뒤오른쪽 금호타이어로 교체");
                    car5.backRightTire = new KumhoTire5("뒤오른쪽", 17);
                    break;
            }
            System.out.println("----------");
        }
        System.out.println("\n\n");
    }
}

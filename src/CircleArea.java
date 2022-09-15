public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14;
        double radius = 10.2;
        double circleArea = radius * radius * PI;

        System.out.println("반지름: " + radius);
        System.out.println("원의 면적: " + circleArea);

        System.out.println("\n\n");

        byte bNum1 = 100;
        System.out.println("byte 타입의 변수 : " + bNum1);
        byte iNum1 = 100;
        System.out.println("byte 타입의 변수 : " + iNum1);

        byte bNum2 = 30;

        System.out.println("byte 타입의 변수 bNum2: " + bNum2);
        System.out.println("byte 타입의 변수의 합 : " + (bNum1 + bNum2));
        byte bNum3 = (byte) (bNum1 + bNum2); //강제로 형변환시킴 (byte)한 이유가 이걸 안하면 int로 자동변환된다.
        System.out.println("byte 타입의 변수 bNUM3: " + bNum3);

        byte bNum4 = -128;
        bNum4 = (byte) (bNum4 - 1);  //-128+(-1) => 127
        System.out.println(bNum4);

//       자동 타입 변환(자동형변환): 작은 데이터 타입의 데이터가 큰 데이터 타입을 변경되는 현상.(소->대)
//        강제 타입 변환 : 큰 데이터 타입을 작은 데이터 타입으로 변경할 경우 사용하는 방법.(대->소)
//        큰 데이터 타입의 데이터를 작은 데이터 타입으로 변경 시 값을 표현하지 못하는 부분에 대한 유실이 발생하기 때문에
//        진짜 타입 변환을 하는지에 대해서 표시를 해야 한다.

//        데이터 타입은 double > float > long>int>short>byte 순으로 크기가 결정이 된다.
//        자동 타입변환
//        정수끼리의 연산 시 기본 데이터 타입인 int타입으로 데이터가 자동 타입 변환이 발생하고 연산이 이루어진 후 데이터가 저장된다.
//        실수끼리의 연산 시 기본 데이터 타입인 double 타입으로 데이터가 자동 타입 변환이 발생하고 연산이 진행된 후 데이터가 저장된다.
//        실수와 정수의 연산 시 실수의 기본 데이터 타입인 double타입으로 데이터가 자동 타입 변환이 발생하고, 연산이 진행 후 데이터가 저장됨
//        연산시 기본 데이터 타입 혹은 더 큰 데이터 타입으로 데이터 타입이 자동으로 변경되는 것을 자동 타입 변환이라고 한다.

//        큰 데이터 타입의 데이터를 작은 데이터 타입의 변수에 저장하고자 할 경우 데이터의 손실이 발생하게 됨.
//        그럼에도 불구하고 데이터 손실이 발생하더라도 작은 데이터 타입의 변수에 큰 데이터 타입의 데이터를 저장해야 할 경우 데이터 손실을
//        감수하겠다는 의미로 작은 데이터 타입을 명시하는 것을 강제타입변환이라고 한다.

//        자동 형 변환
        System.out.println("---자동 형 변환---");
         int iNumber1=0 ;
         byte bNumber1 = 100;

         iNumber1=bNumber1;
         System.out.println("int 변수 iNumber1: "+ iNumber1); //0이었는데 100이 됨. byte가 int가 되었다

        System.out.println("---강제 형 변환---");
        bNumber1=(byte)iNumber1; //int -> byte 데이터 크기 차이 문제가 되었다.(byte)를 넣어준다.
        System.out.println("byte변수 bNumber1 : " +bNumber1);

        int iNumber2= 130; //byte는 128까지만 나온다.
        byte bNumber2 = 0;
        bNumber2=(byte) iNumber2; //-126이 나온다.
        System.out.println("byte변수 bNumber2 : " +bNumber2);

//        int 타입과 double 타입간의 데이터 타입변환

        int iNumber3=100;
        double dNumber3=0.0;
        System.out.println("int 변수 iNumber3 : "+iNumber3);
        System.out.println("double 변수 dNumber3 : "+dNumber3);

        dNumber3=iNumber3;
        System.out.println("형변환 후 dNumber3 : "+dNumber3); //100.0으로 출력된다. 자동 형 변환
        iNumber3=(int)dNumber3; //(int)강제 형 변환. 100.0 에서 100으로 된다.
        System.out.println("형변환 후 iNumber3 : "+iNumber3); //double이 int보다 더 크다. 그러니까 오류가 발생한다.

        byte bNumber4 = 10;
        byte bNumber5=20;
//        정수 타입은 연산 시 기본 데이터 타입인 int타입으로 자동 형 변환이 된다.
        byte bNumber6=(byte)(bNumber4+bNumber5);
        System.out.println(bNumber6);
        //bNumber4+bNumber5가 자동으로 int 타입의 30이 되어야 하는데 byte 타입 변수에 넣으니 오류
//        byte 타입의 변수 2개를 연산 시 int 타입으로 자동 형 변환이 발생하고 그 결과값은 int 타입의 데이터가 됨.
//        int 타입의 데이터를 byte 타입의 변수에 저장하려면 강제 형 변환을 시켜야 한다.

        int iNumber4=100;
//        자동형변환 발생.
        double dNumber4 = 3.0;
        int iResult = (int)(iNumber4/dNumber4);
//        정수와 실수를 연산시 더 큰 데이터 타입인 실수 데이터 타입으로 자동 형 변환이 발생된다.
//        정수 타입의 변수에 데이터를 저장하려면 강제 형 변환이 필요하다.
        System.out.println(iResult);



    }
}
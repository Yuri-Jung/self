package chap05;

public class KumhoTire5 extends Tire5{
    public KumhoTire5(String location, int maxRotation){
        super(location,maxRotation);
    }

    @Override
    public boolean roll(){
        ++accumulatedRotation;

        if(accumulatedRotation<maxRotation){
            System.out.println(location + "KumhoTire5 수명 : " +
                    (maxRotation-accumulatedRotation) + "회");
            return true;
        }
        else{
            System.out.println("***"+ location + "KumhoTire5 펑크 ***");
            return false;
        }
    }
}

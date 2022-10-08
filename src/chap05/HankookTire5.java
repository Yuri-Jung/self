package chap05;

public class HankookTire5 extends Tire5{
    public HankookTire5(String location, int maxRotation){
        super(location,maxRotation);
    }

    @Override
    public boolean roll(){
        ++accumulatedRotation;

        if(accumulatedRotation<maxRotation){
            System.out.println(location + "HankookTire 수명 : " +
                    (maxRotation-accumulatedRotation) + "회");
            return true;
        }
        else{
            System.out.println("***"+ location + "HankookTire 펑크 ***");
            return false;
        }
    }
}

package chap05;

public abstract class Phone4 {
    public String owner2;

    public Phone4(String ownerA){this.owner2 = ownerA;}

    public void trunOn(){
        System.out.println("휴대폰 전원을 켭니다");
    }

    public void turnOff(){
        System.out.println("휴대폰 전원을 끕니다.");
    }
}

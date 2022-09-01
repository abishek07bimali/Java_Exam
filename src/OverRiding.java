
public class OverRiding{
    void override(int num1,int num2){
        int sum=num1+num2;
        System.out.println("sum "+ sum);
    }
}
class override2 extends OverRiding{
    void override(int num1,int num2){
        int sum=num1+num2;
        System.out.println("sum "+ sum);
    }
}

class override3 extends OverRiding{
    void override(int num1,int num2){
        int sum=num1+num2;
        System.out.println("sum "+ sum);
    }
}
class DriverOverRide{
    public static void main(String[] args) {
        OverRiding over= new override2();
        OverRiding over1=new override3();
        over.override(4,5);
        over1.override(6,7);
    }
}

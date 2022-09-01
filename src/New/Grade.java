package New;

public class Grade extends GradeFee{
    @Override
    void calculateFee(String name, String grade, int numOfMonth, int monthlyFee) {
        int totalFee=numOfMonth*monthlyFee;
        System.out.println("The Total fee of "+name+ " studying in "+grade+" is "+ totalFee);
    }
}

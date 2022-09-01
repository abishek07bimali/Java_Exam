import java.util.Scanner;

public class Electricity {
    private float unit;

    public Electricity() {
    }
    public float getUnit() {
        return unit;
    }
    public void setUnit(float unit) {
        this.unit = unit;
    }
}
//extends the super class
class BillCalculator extends  Electricity {
    double billPay;

//    calculate the bill without adding additional charges
    float  calculate(){
        if (getUnit() < 50){
            billPay = getUnit() * 0.50;
        }
        else if (getUnit() <= 150) {
            billPay = 50 * 0.50 + (getUnit() - 50) * 0.75;
        }
        else if (getUnit() < 250) {
            billPay = 50 * 0.50 + 100 * 0.75 + (getUnit() - 150) * 1.20;
        }
        else if (getUnit() >250) {
            billPay = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (getUnit() - 250) * 1.50;
        }
        return (float) billPay;
    }

//    calculate the total amount of electricity
    void calculateTotalBill() {
        calculate();
        float finalBill= (float) (calculate()+0.2*calculate());
        System.out.println(finalBill);
    }
}
//driver class
class DriverClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BillCalculator bill=new BillCalculator();
        System.out.println("Enter the unit of electricity: ");
        bill.setUnit(sc.nextFloat());
        bill.calculateTotalBill();

    }
}


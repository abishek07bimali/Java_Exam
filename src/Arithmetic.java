public class Arithmetic {
    int add(int a,int b){
        int sum=a+b;
        return sum;
    }
}

class Adder extends Arithmetic{
    @Override
    int add(int a, int b) {
        return super.add(a, b);
    }
}
class Solution{

    public static void main(String[] args) {
        Adder adder=new Adder();
        System.out.println("My super class is: Arithmetic");
        System.out.println( adder.add(2,3));
    }

}
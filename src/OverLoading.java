public class OverLoading {
        void over(int num1,int num2){
            System.out.println("sum "+ num1+num2);
        }
        void over(int num3,int num4,int num5){
            System.out.println("sum: "+ num3+num4+num5);
        }
    }
    class DriverOverloading{
        public static void main(String[] args) {
            OverLoading overLoading=new OverLoading();
            overLoading.over(2,3);
            overLoading.over(5,6,7);
        }
    }


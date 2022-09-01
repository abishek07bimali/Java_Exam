public class ReturnFactor {
        int countFactor(){
            int A=10;
            int B=15;
            int countA=0;
            int countB=0;
            for(int i=1;i<=A;i++){
                if (A%i==0){
                    countA++;
                }
            }
            for(int i=1;i<=B;i++){
                if (B%i==0){
                    countB++;
                }
            }
            if(countA==countB){
                return 1;
            }
            else {
                return 0;
            }

        }

        public static void main(String[] args) {
            ReturnFactor returnFactor=new ReturnFactor();
            System.out.println(returnFactor.countFactor());
        }

    }

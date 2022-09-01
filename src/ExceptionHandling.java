import java.util.Scanner;

public class ExceptionHandling {
    String X;
    ExceptionHandling(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        X = input.next();
    }
    static void checkException() throws Exception{
        ExceptionHandling except = new ExceptionHandling();
        if (except.X.length()<=1){
            throw new Exception("String must be greater than 1!");
        } else {
            System.out.println(except.X.charAt(1));
        }
    }
    public static void main(String[] args) {
        try {
            checkException();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}


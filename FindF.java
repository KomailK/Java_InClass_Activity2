public class FindF {

    public static void main(String[] args) throws OutOfRangeException {

    int f1=Factorial(5);
    System.out.println(f1);}

    public static int Factorial(int value1) throws OutOfRangeException  {


        if(value1<0 || value1>10)
        {
            throw new OutOfRangeException("Value not between 0 and 10");
        }
        int result = 1;
        for (int i = 1; i <= value1; i++) {
            result *= i ;
        }

        return result;

    }
}

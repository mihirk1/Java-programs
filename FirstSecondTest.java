public class FirstSecondTest
{
    public static void main(String[] args)
    {
            FirstSecond fs = new FirstSecond();
            fs.method1();
            fs.method2();
            fs.methodOne();
            
            IFirst iref1 = new FirstSecond();
            iref1.method1();
    }   
}
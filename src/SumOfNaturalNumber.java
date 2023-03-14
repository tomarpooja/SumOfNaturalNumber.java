public class SumOfNaturalNumber {
    public static void main(String[] args)
        {
        int num=1000 ,i=5,Sum = 0;
        //executes until the condition returns true
        while(i<=num)
        {
            //adding the value of i into sum variable
            Sum = Sum + i;
            i++;
        }
        //prints the sum
        System.out.println("Sum of First 100 Natural Number is="+Sum);
    }
}
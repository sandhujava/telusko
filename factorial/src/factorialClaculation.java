public class factorialClaculation {

    public  int factorial(int number){
        if(number==1){
            return 1;
        }
        return number*factorial(number-1);
    }
}

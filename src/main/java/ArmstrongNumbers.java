public class ArmstrongNumbers {
    public boolean isArmstrongNumber(int input) {
        int length = String.valueOf(input).length(), temp = input, rem;
        int sum = 0, mod;
        do
        {
            mod = temp % 10;
            temp = temp/10;
            sum = sum + (int)(Math.pow(mod, length));
        }while(temp > 0);
        //int sum = (int)(Math.pow(input/10,2) + Math.pow(input%10, 2));
        return  input == sum;
    }
}

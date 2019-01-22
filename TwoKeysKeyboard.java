import java.util.HashMap;
class TwoKeysKeyboard{
    static HashMap<Integer,Integer> lookup = new HashMap<Integer, Integer>();
    public static void main(String args[]){
        TwoKeysKeyboard keyboard = new TwoKeysKeyboard();
        lookup.put(0,0);
        int n = 310;
        keyboard.minStepsFactors(n);
    }

    public void minStepsFactors(int n){
        int divisor = 2;
        int sum = 0;
        int copy = n;
        while(divisor <= Math.sqrt(copy)){
            if(n % divisor == 0){
                sum += divisor;
                n /= divisor;
            }
            else
                divisor++;
        }
        System.out.println(sum);
    }
    public void minSteps(int n){
        if(n % 2 == 0 && n !=2){
            minSteps(n/2);
            lookup.put(n, lookup.get(n/2)+2);
        }
        else if(n % 3 == 0 && n !=3){
            minSteps(n/3);
            lookup.put(n, lookup.get(n/3)+3);
        }
        else
            lookup.put(n, n);
    }
}
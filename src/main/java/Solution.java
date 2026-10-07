public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1 + t2 + t3 + t4) / 4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int)(average + 0.5);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return roundedAverage >= 65;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return shares * price;
    }


    public int roundValueChange(double totalStock) 
    {
        // remove 0 and return your answer
        return (int) Math.round(totalStock);
        
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        //remove 0.0 and return your answer 123.90
        int num1 = (int)(((userDouble / 100) + 1 ) % 10);
        int num2 = (int)(((userDouble % 100) / 10 + 1 ) % 10);
        int num3 = (int)(((userDouble % 10) / 1 + 1 ) % 10);
        int num4 = (int)(((userDouble % 1) / .1 + 1 ) % 10);
        double num5 = (double)(((int)(((userDouble % 0.1) / 0.01) + 0.5) + 1 ) % 10);

        userDouble = num1 * 100 + num2 *10 + num3 *1 + num4 * 0.1 + num5 * 0.01;
        return userDouble;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //459.89
    }
}

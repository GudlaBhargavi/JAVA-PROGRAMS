public class Digit {
    public static void main(String[] args) {
        int N=99;
        int r=3;

        int sumN=0;
        int tempN=N;

        while(tempN>0){
            sumN += tempN%10;
            tempN /=10;
        }
       // System.out.print(tempN);
        //System.out.print(sumN);

        int repeatedSum = sumN * r;
        System.out.println(repeatedSum);

        while (repeatedSum >= 10) {
            int tempSum = 0;
            while (repeatedSum > 0) {
                tempSum += repeatedSum % 10;
                System.out.println(tempSum);
                repeatedSum /= 10;
                System.out.println(repeatedSum);
            }
            repeatedSum = tempSum;  
        }

        System.out.println(repeatedSum);


    }
    
}

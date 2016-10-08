public class t04 {
    public static void main (String [] args){
        double [] array = {0.52, 6.8, 8.9, 3.5, 0.102, 4.7};
        double max = 0;
        for (int i=0; i<(array.length)/2; ++i)
        {
            double sum = array[i]+array[array.length-i-1];
            System.out.println("Sum of "+i+" and "+ (array.length-i-1)+ " elements = " + sum);
            if(sum>max) {max = sum;}
        }
        System.out.println("Max sum for array's elements = " + max);
    }

}

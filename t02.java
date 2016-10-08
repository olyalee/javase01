public class t02 {

    public static void main (String [] args){






    getTask2(0.1,10);
    }

    public static void getTask2(double e,int size){
        double[] doubles = new double[size];
        int number = 0;
        for (int i = 1; i <= size; i++){
            doubles[i-1] = 1 / (Math.pow(i+1,2));
            System.out.println(doubles[i-1]);
        }
        for (int i = 1; i <= doubles.length ; i++) {
            if (doubles[i-1] < e){
                number = i;
                System.out.println("number = " +number);
                break;
            }
        }
    }


}

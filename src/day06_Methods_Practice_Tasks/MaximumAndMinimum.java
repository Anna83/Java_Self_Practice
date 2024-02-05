package day06_Methods_Practice_Tasks;

    public class MaximumAndMinimum {
        public static void main(String[] args) {
            double n = max(10.5,30.2 );
            System.out.println(n);

            int m = min(100,200);
            System.out.println(m);

        }

        public static int max(int num1, int num2){
            if (num1>num2){
                return num1;
            }else {
                return num2;
            }
        }

        public static double max(double num1, double num2){
            if (num1> num2){
                return num1;
            }
            return num2;
        }

        public static int min(int num1, int num2){
            if (num1< num2){
                return num1;
            }else {
                return num2;
            }
        }
        public static double min(double num1,double num2) {
            if (num1 < num2) {
                return num1;
            }
            return num2;
        }
    }
package day05_loopspractictesks;

public class Alphabet {



        public static void main(String[] args) {

            //for column
            for (char i = 'A'; i <= 'E'; i++) {
                //for row
                for (char j = 'a'; j <= 'z'; j++) {

                    System.out.print(i);
                    System.out.print(j + " ");
                }
                System.out.println();
            }

        }


    }

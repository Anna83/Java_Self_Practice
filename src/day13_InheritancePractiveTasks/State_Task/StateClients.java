package day13_InheritancePractiveTasks.State_Task;

public class StateClients {
    public static void main(String[] args) {

        Virginia Virginia = new Virginia("Virginia", "VG",
                "Democratic Party", "Ralph Northam", "Mark Warner", 865);


        Texas Texas = new Texas("Texas", "TX", "Republican Party",
                "Greg Abbott", "Ted Cruz", 29);


        California Californi = new California("California ","CA", "Democratic Party",
                "Gavin Newsome", "Dienne Feinstein", 39);

        Florida Florida = new Florida( "Florida", "FL",
                "Republican Party", "Ron DeSantos","Marco Rubio", 21);

        System.out.println(Virginia);
        System.out.println(Texas);
        System.out.println(Californi);
        System.out.println(Florida);


    }



}
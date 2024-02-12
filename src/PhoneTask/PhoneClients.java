package PhoneTask;

import PhoneTask.IPhone;
import PhoneTask.Nokia;
import PhoneTask.Samsung;

public class PhoneClients {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("Apple", "IPhone 13 pro max",
                "Small", 1_700, "White");
        iPhone.call("8156070707");
        iPhone.text("8156070707");
        iPhone.faceTime("8156070707");
        System.out.println(iPhone);
        System.out.println("_____________________________________________________________");

        Samsung Samsung = new Samsung("Samsung", "Galaxy",
                "large", 900, "Gray");

        Samsung.call("7279099000");
        Samsung.text("7279099000");
        Samsung.faceTime("7279099000");
        System.out.println(Samsung);

        System.out.println("__________________________________________________________________");

        Nokia Nokia = new Nokia("Nokia","Nokia 7.2",
                "6.3 inches", 29_9,"Red");
        Nokia.call("7176068000");
        Nokia.text("7176068000");
        Nokia.faceTime("7176068000");
        System.out.println(Nokia);



    }



}






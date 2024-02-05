package day07costum_class_tasks;

public class AddressClient {
    public static void main(String[] args) {

        Address address1 = new Address();

        address1.buildingNumber = 7925;
        address1.street = "Jones Branch Dr";
        address1.city = "McLean";
        address1.state = "VA";
        address1.zipCode = String.valueOf(22012);

        System.out.println(address1.buildingNumber + " " + address1.street);
        System.out.print(address1.city + " " + address1.state + ", " + address1.zipCode);


        Address address2 = new Address();
        address2.buildingNumber = 2142;
        address2.street = "Campus dr";
        address2.city = "Clearwater";
        address2.state = "FL";
        address2.zipCode = "33764";

        System.out.println(address2);
        }
    }



/*
Attributes:
            buildingNumber (int): used to store the building number of the address.
            street (String): used to store the street of the address.
            city (String): used to store the city of the address.
            state (String): used to store the state abbreviations of the address.
            zipCode (String): used to store the zip code of the address.

      Actions:
            toString(): returns the string representation of the address object in the following format:

                  Example:
                      buildingNumber = 7925;
                      street = "Jones Branch Dr";
                      city = "McLean";
                      state = "VA";
                       zipCode = 22012;

                  Output:
                        7925 Jones Branch Dr
                        McLean Va, 22012


      Create another class named AddressClients, create multiple address objects, and test each function of the address object.

 */
package day14_practice_tasks.Car_Task;

public class CarClients {
    public static void main(String[] args) {



        Car toyota = new Toyota("Toyota","Cemry",2023,25_000,"White");
        System.out.println(toyota);
        toyota.start();
        toyota.drive();
        toyota.stop();

        System.out.println("---------------------------------------------------------------");

        Car honda = new Honda("Honda ","Accord ", 2022,24_000,"Blue");
        System.out.println(honda);
        honda.start();
        honda.stop();
        honda.drive();

        System.out.println("---------------------------------------------------------------");

        Car bmw = new BMW("Bmw","X5",2022, 65000,"Red");
        System.out.println(bmw);
        bmw.start();
        bmw.stop();
        bmw.drive();

        System.out.println("----------------------------------------------------------------");

        Car audi = new Audi("Audi ", "Q7",2023, 70_000, "Black");
        System.out.println(audi);
        audi.stop();
        audi.start();
        audi.drive();


        System.out.println("---------------------------------------------------------------");

        Car mercedes = new Mercedes("Mercedes", "S Class", 2023,80_000,"Silver");
        System.out.println(mercedes);
        mercedes.stop();
        mercedes.start();
        mercedes.drive();

        System.out.println("--------------------------------------------------------");

        Car tesla = new Tesla("Tesla ","Model 3", 2024,45_000, "Gray");
        System.out.println(tesla);
        tesla.stop();
        tesla.start();
        tesla.drive();

        System.out.println("----------------------------------------------------------------");

        Car nio = new Nio("Nio ","ES8",2023,45_000,"Black");
        System.out.println(nio);
        nio.stop();
        nio.start();
        nio.drive();

        System.out.println("----------------------------------------------------------------");

        Car cydeoCar = new CydeoCar("Cydeo","Programmer", 2025,200_000,"Yellow");
        System.out.println(cydeoCar);
        cydeoCar.stop();
        cydeoCar.start();
        cydeoCar.drive();




                //    - Test all functions of each object.
                testCar(toyota);
                testCar(honda);
                testCar(bmw);
                testCar(audi);
                testCar(mercedes);
                testCar(tesla);
                testCar(nio);
                testCar(cydeoCar);
            }

            //    - Test all functions of each object.
            public static void testCar(Car car) {
                System.out.println("Testing " + car.getModel() + " " + car.getMake()+ ":");
                car.start();
                car.drive();
                car.stop();
                if (car instanceof AutoPark autoParkCar) {
                    System.out.println("Has Auto Park: " + autoParkCar.hasAutoPark);
                    autoParkCar.autoPark();
                }
                if (car instanceof AutoPilot autoPilotCar) {
                    System.out.println("Has Auto Pilot: " + autoPilotCar.hasAutoPilot);
                    autoPilotCar.selfDrive();
                }
                if (car instanceof Flyable flyableCar) {
                    System.out.println("Can Fly: " + flyableCar.canFly);
                }
                System.out.println();
            }
        }










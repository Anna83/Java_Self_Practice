package day14_practice_tasks.Car_Task;

import day14_practice_tasks.Car_Task.AutoPark;

public interface AutoPilot extends AutoPark {

    boolean hasAutoPilot = true;
    public void selfDrive();


}
/*
Create a Child Interface of AutoPark Named 'AutoPilot':
    - Note: Use the 'extends' keyword for inheritance.
    - Variables:
        - hasAutoPilot
    - Abstract Method:
        - selfDrive()
 */
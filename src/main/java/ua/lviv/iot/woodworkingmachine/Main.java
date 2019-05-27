package ua.lviv.iot.woodworkingmachine;

import ua.lviv.iot.woodworkingmachine.manager.MachineManager;
import ua.lviv.iot.woodworkingmachine.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<WoodworkingMachine> woodworkingMachines = new ArrayList<>();
        CirucularMachine liniyka = new CirucularMachine ("liniyka" , "painting",  70, 10, ClassificationType.PRESS_FORGING, 15, 35);
        WoodworkingMachine cleaner = new WoodworkingMachine ("cleaner", "drawing", 30, 40);
        RamusMachine processing = new RamusMachine( "procesing",  "fills in",  43, 20 , ProcessingType.DRILL);
        woodworkingMachines.add(liniyka);
        woodworkingMachines.add(cleaner);
        woodworkingMachines.add(processing);

        MachineManager manager = new MachineManager(woodworkingMachines);
        manager.sortByPower(woodworkingMachines, false).forEach(System.out::println);
        manager.sortByPower(woodworkingMachines, true).forEach(System.out::println);
        manager.sortByVolume(woodworkingMachines, false).forEach(System.out::println);
        manager.sortByVolume(woodworkingMachines, true).forEach(System.out::println);
    }
}

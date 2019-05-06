package ua.lviv.iot.woodworkingmachine;

//import ua.lviv.iot.woodworkingmachine.manager.MachinesManagerlmpl;
import ua.lviv.iot.woodworkingmachine.manager.MachineManager;
import ua.lviv.iot.woodworkingmachine.models.*;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Main {

    public static void main(final String[] args) {

        List<WoodworkingMachine> woodworkingMachines = new ArrayList<>();
        CirucularMachine cirkul = new CirucularMachine(
                "cirkul",
                "drawing",
                30,
                20,
                40);
        CirucularMachine liniyka = new CirucularMachine(
                "liniyka",
                "painting",
                70,  ClassificationType.PRESS_FORGING, 15, 35);
        WoodworkingMachine cleaner = new WoodworkingMachine(
                "cleaner",
                "drawing",
                30, ClassificationType.GORIZONTAL_DRILLING);
        WoodworkingMachine washer = new WoodworkingMachine(
                "washer",
                "painter",
                34);
        RamusMachine processing = new RamusMachine(
                "procesing",
                "fills in",
                43);
        RamusMachine tuborg = new RamusMachine("tuborg", "empty", 39);
        woodworkingMachines.add(cirkul);
        woodworkingMachines.add(liniyka);
        woodworkingMachines.add(cleaner);
        woodworkingMachines.add(washer);
        woodworkingMachines.add(processing);
        woodworkingMachines.add(tuborg);

        MachineManager manager = new MachineManager(woodworkingMachines);
        manager.sortByPower(woodworkingMachines,
                false).forEach(System.out::println);
        manager.sortByPower(woodworkingMachines,
                true).forEach(System.out::println);
        manager.sortByVolume(woodworkingMachines,
                false).forEach(System.out::println);
        manager.sortByVolume(woodworkingMachines,
                true).forEach(System.out::println);


    }
}

package ua.lviv.iot.woodworkingmachine.manager;

import ua.lviv.iot.woodworkingmachine.models.RamusMachine;
import ua.lviv.iot.woodworkingmachine.models.WoodworkingMachine;


import java.util.*;

public class MachineManager {

    private List<WoodworkingMachine> machinesList;

    public MachineManager(List<WoodworkingMachine> woodworkingMachines) {
        this.machinesList = woodworkingMachines;
    }

    public List<WoodworkingMachine> sortByVolume(List<WoodworkingMachine> machines, boolean reverse) {
        Comparator<WoodworkingMachine> comparator = ((WoodworkingMachine k1, WoodworkingMachine k2) -> (int) (k1.getVolume() - k2.getVolume()));
        machines.sort(comparator);
        if (reverse) {
            Collections.reverse(machines);
        }
        return machinesList;
    }


    public List<WoodworkingMachine> sortByPower(List<WoodworkingMachine> machines, boolean ascending) {
        if (ascending) {
            machines.sort(Comparator.comparing(WoodworkingMachine::getPower).reversed());
        } else {
            machines.sort(Comparator.comparing(WoodworkingMachine::getPower));
        }
        return machines;
    }


    public void toAdd(WoodworkingMachine machine) {
        this.machinesList.add(machine);
    }
}
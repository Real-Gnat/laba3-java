package ua.lviv.iot.woodworkingmachine.manager;

import ua.lviv.iot.woodworkingmachine.models.WoodworkingMachine;

import java.util.Comparator;
import java.util.List;

public class MachineManager {
    private List<WoodworkingMachine> machinesList;

    public MachineManager(List<WoodworkingMachine> woodworkingMachines) {
        this.machinesList = woodworkingMachines;
    }

    public List<WoodworkingMachine> sortByVolume(List<WoodworkingMachine> machines, boolean ascending) {
        if (ascending) {
            machines.sort(Comparator.comparing(WoodworkingMachine::getVolume).reversed());
        } else {
            machines.sort(Comparator.comparing(WoodworkingMachine::getVolume));
        }
        return machines;
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

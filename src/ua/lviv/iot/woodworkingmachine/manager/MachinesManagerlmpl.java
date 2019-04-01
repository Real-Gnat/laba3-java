package ua.lviv.iot.woodworkingmachine.manager;

import ua.lviv.iot.woodworkingmachine.models.*;
import ua.lviv.iot.woodworkingmachine.manager.MachineManager;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MachinesManagerlmpl implements MachineManager {

    private List<WoodworkingMachine> machinesList;

    public MachinesManagerlmpl(List<WoodworkingMachine> machinesList) {
        this.machinesList = machinesList;
    }

    public void setMachinesList(List<WoodworkingMachine> machinesList) {
        this.machinesList = machinesList;
    }

    @Override
    public List<WoodworkingMachine> findBy(final String name) {
        return machinesList.stream().filter(machine -> machine.getName().equals(name)).collect(Collectors.toList());
    }

    public List<WoodworkingMachine> sortByVolume(List<WoodworkingMachine> machinesList, boolean reverse) {
        Comparator<WoodworkingMachine> comparator = ((WoodworkingMachine k1, WoodworkingMachine k2) -> (int) (k1.getVolume() - k2.getVolume()));
        machinesList.sort(comparator);
        if (reverse) {
            Collections.reverse(machinesList);
        }
        return machinesList;
    }



    public List<WoodworkingMachine> sortByPower(List<WoodworkingMachine> machinesList, boolean reverse) {
        Comparator<WoodworkingMachine> comparator = ((WoodworkingMachine k1, WoodworkingMachine k2) -> (int) (k1.getPower() - k2.getPower()));
        machinesList.sort(comparator);
        if (reverse) {
            Collections.reverse(machinesList);
        }
        return machinesList;
    }


    public List<WoodsworkingMachine> sortByPower(boolean ascending) {
        if (ascending) {
            Collections.sort(machinesList, Comparator.comparing(WoodsworkingMachine::getPower).reversed());
        } else {
            Collections.sort(machinesList, Comparator.comparing(WoodsworkingMachine::getPower));
        }
        return machinesList;
    }
}

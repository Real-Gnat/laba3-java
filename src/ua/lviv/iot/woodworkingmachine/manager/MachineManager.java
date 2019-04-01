package ua.lviv.iot.woodworkingmachine.manager;

import java.util.List;

public interface MachineManager {
    List<WoodworkingMachine> findBy(String name);

    void sortByVolume (List<WoodworkingMachine> MachinesManager , boolean reverse);
    void sortByPower (List<WoodworkingMachine> MachinesManager , boolean reverse);


}

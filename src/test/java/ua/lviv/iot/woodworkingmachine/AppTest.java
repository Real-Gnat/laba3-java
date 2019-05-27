package ua.lviv.iot.woodworkingmachine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.woodworkingmachine.manager.MachineManager;
import ua.lviv.iot.woodworkingmachine.models.*;

import java.util.ArrayList;
import java.util.List;



public class AppTest {
    private List<WoodworkingMachine> woodworkingMachines = new ArrayList<>();
    private MachineManager manager = new MachineManager(woodworkingMachines);

    @BeforeEach
    final void addList() {
        manager.toAdd(new CirucularMachine("liniyka", "painting", 70, 4, ClassificationType.PRESS_FORGING, 15, 35));
        manager.toAdd(new WoodworkingMachine("cleaner", "drawing", 30, 6));
        manager.toAdd(new RamusMachine("procesing", "fills in", 43, 7, ProcessingType.DRILL));
        CirucularMachine liniyka = new CirucularMachine("liniyka", "painting", 70, 4, ClassificationType.PRESS_FORGING, 15, 35);
        WoodworkingMachine cleaner = new WoodworkingMachine("cleaner", "drawing", 30, 6);
        RamusMachine processing = new RamusMachine("procesing", "fills in", 43, 7, ProcessingType.DRILL);
        woodworkingMachines.add(liniyka);
        woodworkingMachines.add(cleaner);
        woodworkingMachines.add(processing);
    }

    @Test
    final void sortByVolumeAscending() {
        manager.sortByVolume(woodworkingMachines, false);
        Assertions.assertEquals(4, woodworkingMachines.get(0).getVolume());
        Assertions.assertEquals(4, woodworkingMachines.get(1).getVolume());
        Assertions.assertEquals(6, woodworkingMachines.get(2).getVolume());
    }

    @Test
    final void sortByVolumeDescending() {
        manager.sortByVolume(woodworkingMachines, true);
        Assertions.assertEquals(6, woodworkingMachines.get(2).getVolume());
        Assertions.assertEquals(7, woodworkingMachines.get(1).getVolume());
        Assertions.assertEquals(7, woodworkingMachines.get(0).getVolume());
    }

    @Test
    final void sortByPowerAscending() {
        manager.sortByVolume(woodworkingMachines, false);
        Assertions.assertEquals(70, woodworkingMachines.get(0).getPower());
        Assertions.assertEquals(70, woodworkingMachines.get(1).getPower());
        Assertions.assertEquals(30, woodworkingMachines.get(2).getPower());
    }

    @Test
    final void sortByPowerDescending() {
        manager.sortByVolume(woodworkingMachines, true);
        Assertions.assertEquals(30, woodworkingMachines.get(2).getPower());
        Assertions.assertEquals(43, woodworkingMachines.get(1).getPower());
        Assertions.assertEquals(43, woodworkingMachines.get(0).getPower());
    }

    @Test
    final void testListWithNewNullElement() {
        manager.toAdd(null);
        Assertions.assertEquals(7, woodworkingMachines.size());
    }

    @Test
    final void testSetNewListOfStationary() {
        woodworkingMachines = new ArrayList<>();
        woodworkingMachines.add(new CirucularMachine("liniyka", "painting", 70, 4, ClassificationType.PRESS_FORGING, 15, 35));
        woodworkingMachines.add(new WoodworkingMachine("cleaner", "drawing", 30, 6));
        woodworkingMachines.add(new RamusMachine("procesing", "fills in", 43, 7, ProcessingType.DRILL));
        Assertions.assertEquals(3, woodworkingMachines.size());
    }
}

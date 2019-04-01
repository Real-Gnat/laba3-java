package ua.lviv.iot.woodworkingmachine;

import ua.lviv.iot.woodworkingmachine.manager.MachinesManagerlmpl;
import ua.lviv.iot.woodworkingmachine.models.WoodsworkingMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<WoodsworkingMachine> WoodworkingMachine = new ArrayList<>();
        WoodworkingMachine.add(new WoodsworkingMachine());

        MachinesManagerlmpl manager = new MachinesManagerlmpl(WoodworkingMachine);

        manager.sortByPower(WoodworkingMachine);


    }
}

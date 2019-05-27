package ua.lviv.iot.woodworkingmachine.models;

public class RamusMachine extends WoodworkingMachine {
    private  ProcessingType Processing;

    public RamusMachine(String name, String appointment, double power, double volume, ProcessingType processing) {
        super(name, appointment, power, volume);
        this.Processing = processing;
    }

    //public RamusMachine(String procesing, String fills_in, int i) {
    //    super("cleaner", "drawing", 30, 70, ClassificationType.GORIZONTAL_DRILLING);
    //}

    public ProcessingType getProcessing() {
        return Processing;
    }

    public void setProcessing(ProcessingType processing) {
        this.Processing = processing;
    }

    @Override
    public String toString() {
        return "RamusMachine{" +
                "Processing=" + Processing +
                '}';
    }
}

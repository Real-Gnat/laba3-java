package ua.lviv.iot.woodworkingmachine.models;

public class RamusMachine extends WoodworkingMachine {
    private  ProcessingType Processing;

    public RamusMachine(String name, String appointment, double power, ProcessingType processing) {
        super(name, appointment, power);
        this.Processing = processing;
    }

    public RamusMachine(String procesing, String fills_in, int i) {
        super("cleaner", "drawing", 30, ClassificationType.GORIZONTAL_DRILLING);
    }

    public ProcessingType getProcessing() {
        return Processing;
    }

    public void setProcessing(ProcessingType processing) {
        this.Processing = processing;
    }
}

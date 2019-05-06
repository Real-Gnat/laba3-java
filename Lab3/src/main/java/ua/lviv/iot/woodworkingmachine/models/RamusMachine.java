package ua.lviv.iot.woodworkingmachine.models;

public class RamusMachine extends WoodworkingMachine {
    private  ProcessingType Processing;

    public RamusMachine(
            final String name,
            final String appointment,
            final double power,
            final ProcessingType processing) {
        super(name, appointment, power);
        this.Processing = processing;
    }

    public RamusMachine(
            final String procesing,
            final String fills_in,
            final int i) {
        super("cleaner", "drawing", 30, ClassificationType.GORIZONTAL_DRILLING);
    }

    public ProcessingType getProcessing() {
        return Processing;
    }

    public void setProcessing(final ProcessingType processing) {
        this.Processing = processing;
    }
}

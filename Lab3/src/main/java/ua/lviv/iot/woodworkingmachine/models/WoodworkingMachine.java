package ua.lviv.iot.woodworkingmachine.models;

public class WoodworkingMachine {
    private String name;
    private String appointment;
    private double power;
    private double volume;

    public WoodworkingMachine(
            final String name,
            final String appointment,
            final double power) {
        this.name = name;
        this.appointment = appointment;
        this.power = power;
        this.volume = volume;
    }

    public WoodworkingMachine(
            final String cleaner,
            final String drawing,
            final int i,
            final ClassificationType gorizontalDrilling) {
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(final String appointment) {
        this.appointment = appointment;
    }

    public double getPower() {
        return power;
    }

    public void setPower(final double power) {
        this.power = power;
    }

    public static <U  extends Comparable<? super U>, T> U getProductionCompany(
            final T t) {
        return null; }


    public double getVolume() {
        return volume;
    }

    public void setVolume(final double volume) {
        this.volume = volume;
    }
}


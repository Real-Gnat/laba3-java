package ua.lviv.iot.woodworkingmachine.models;

public class WoodworkingMachine {
    private String name;
    private String appointment;
    private double power;
    private double volume;

    public WoodworkingMachine(String name, String appointment, double power, double volume) {
        this.name = name;
        this.appointment = appointment;
        this.power = power;
        this.volume = volume;
    }

    public WoodworkingMachine() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public static <U extends Comparable<? super U>, T> U getProductionCompany(T t) {
        return null;
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "WoodworkingMachine{" +
                "name='" + name + '\'' +
                ", appointment='" + appointment + '\'' +
                ", power=" + power +
                ", volume=" + volume +
                '}';
    }
}


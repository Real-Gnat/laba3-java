package ua.lviv.iot.woodworkingmachine.models;

public class CirucularMachine extends WoodworkingMachine {
    private  ClassificationType Classification;
    private double Radius;
    private double Sortie;

    public CirucularMachine(final String name,
                            final String appointment,
                            final double power,
                            final ClassificationType classification,
                            final double radius,
                            final double sortie) {
        super(name, appointment, power);
        Classification = classification;
        Radius = radius;
        Sortie = sortie;
    }

    public CirucularMachine(
            final String cirkul,
            final String drawing,
            final int i,
            final int i1,
            final int i2) {
        super("cleaner", "drawing", 30, ClassificationType.GORIZONTAL_DRILLING);
    }

    public ClassificationType getClassification() {
        return Classification;
    }

    public void setClassification(final ClassificationType classification) {
        this.Classification = classification;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(final double radius) {
        this.Radius = radius;
    }

    public double getSortie() {
        return Sortie;
    }

    public void setSortie(final double sortie) {
        this.Sortie = sortie;
    }
}

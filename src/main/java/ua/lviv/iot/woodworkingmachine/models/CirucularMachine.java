package ua.lviv.iot.woodworkingmachine.models;

public class CirucularMachine extends WoodworkingMachine{
    private  ClassificationType Classification;
    private double Radius;
    private double Sortie;

    public CirucularMachine(String name, String appointment, double power, double volume, ClassificationType classification, double radius, double sortie) {
        super(name, appointment, power, volume);
        Classification = classification;
        Radius = radius;
        Sortie = sortie;
    }

    //public CirucularMachine(String cirkul, String drawing, int i, int i1, int i2) {
    //    super("cleaner", "drawing", 30, ClassificationType.GORIZONTAL_DRILLING);
    //}

    @Override
    public String toString() {
        return "CirucularMachine{" +
                "Classification=" + Classification +
                ", Radius=" + Radius +
                ", Sortie=" + Sortie +
                '}';
    }

    public ClassificationType getClassification() {
        return Classification;
    }

    public void setClassification(ClassificationType classification) {
        this.Classification = classification;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        this.Radius = radius;
    }

    public double getSortie() {
        return Sortie;
    }

    public void setSortie(double sortie) {
        this.Sortie = sortie;
    }
}
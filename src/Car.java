import java.time.Year;

public class Car {
    private String name;
    private String nomer;
    private Year releaseyear;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name +"\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public Year getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(Year releaseyear) {
        this.releaseyear = releaseyear;
    }

    public Car(String name, String nomer, Year releaseyear) {
        this.name = name;
        this.nomer = nomer;
        this.releaseyear = releaseyear;
    }
}

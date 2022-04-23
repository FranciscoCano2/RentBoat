package herencia_5_extra.entity;

import herencia_5_extra.constant.Constant;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Boat implements Constant {

    private Integer registrationNumber;
    private Float length;
    private Integer yearOfProduction;
    private Double precioBase;

    public Boat() {
    }

    public Boat(Integer registrationNumber, Float length, Integer yearOfProduction, Double precioBase) {
        this.registrationNumber = registrationNumber;
        this.length = length;
        this.yearOfProduction = yearOfProduction;
        this.precioBase = precioBase;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void CrearBote() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println(YEAR);
        yearOfProduction = leer.nextInt();

        System.out.println(REGISTRY);
        registrationNumber = leer.nextInt();

        System.out.println(LENGHT);
        length = leer.nextFloat();

        precioBase = calculoPrecioBase(length);
    }

    protected Double calculoPrecioBase(double eslora) {
        double calcularPrecioBase;

        return calcularPrecioBase = eslora * 10;

    }
}

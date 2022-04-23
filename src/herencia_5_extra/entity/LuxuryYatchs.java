package herencia_5_extra.entity;

/**
 *
 * @author franc
 */
public class LuxuryYatchs extends Boat {

    private Integer cv;
    private Integer numberCabins;

    public LuxuryYatchs() {
    }

    public LuxuryYatchs(Integer cv, Integer numberCabins, Integer registrationNumber, Float length, Integer yearOfProduction, Double precioBase) {
        super(registrationNumber, length, yearOfProduction, precioBase);
        this.cv = cv;
        this.numberCabins = numberCabins;
    }

   

    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
    }

    public Integer getNumberCabins() {
        return numberCabins;
    }

    public void setNumberCabins(Integer numberCabins) {
        this.numberCabins = numberCabins;
    }

}

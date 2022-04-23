package herencia_5_extra.entity;

/**
 *
 * @author franc
 */
public class SailBoat extends Boat {

    private Integer numberMast;

    public SailBoat() {
    }

    public SailBoat(Integer numberMast, Integer registrationNumber, Float length, Integer yearOfProduction, Double precioBase) {
        super(registrationNumber, length, yearOfProduction, precioBase);
        this.numberMast = numberMast;
    }
     

    public Integer getNumberMast() {
        return numberMast;
    }

    public void setNumberMast(Integer numberMast) {
        this.numberMast = numberMast;
    }

}

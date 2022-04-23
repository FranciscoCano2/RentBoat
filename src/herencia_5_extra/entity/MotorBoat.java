package herencia_5_extra.entity;

/**
 *
 * @author franc
 */
public class MotorBoat extends Boat {

    private Integer cv;

    public MotorBoat() {
    }

    public MotorBoat(Integer cv, Integer registrationNumber, Float length, Integer yearOfProduction, Double precioBase) {
        super(registrationNumber, length, yearOfProduction, precioBase);
        this.cv = cv;
    }

 

    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
    }



}

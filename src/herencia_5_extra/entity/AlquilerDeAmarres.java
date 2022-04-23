package herencia_5_extra.entity;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author franc
 */
public class AlquilerDeAmarres {

    private String name;
    private Integer dni;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private String position;
    private Boat parkedBoat;
    private Double rentalPrice;

    public AlquilerDeAmarres() {
    }

    public AlquilerDeAmarres(String name, Integer dni, LocalDate rentalDate, LocalDate returnDate, String position, Boat parkedBoat, Double rentalPrice) {
        this.name = name;
        this.dni = dni;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.position = position;
        this.parkedBoat = parkedBoat;
        this.rentalPrice = rentalPrice;
    }

    public Double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(Double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boat getParkedBoat() {
        return parkedBoat;
    }

    public void setParkedBoat(Boat parkedBoat) {
        this.parkedBoat = parkedBoat;
    }

}

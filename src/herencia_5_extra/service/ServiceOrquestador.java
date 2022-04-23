package herencia_5_extra.service;

import herencia_5_extra.constant.Constant;
import herencia_5_extra.entity.AlquilerDeAmarres;
import herencia_5_extra.entity.Boat;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class ServiceOrquestador implements Constant {

    private final Scanner leer;

    public ServiceOrquestador() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public int assignBoatTipe() {

        int option = 0;

        do {
            System.out.println("1-" + BOAT);
            System.out.println("2-" + SAILBOAT);
            System.out.println("3-" + MOTORBOAT);
            System.out.println("4-" + LUXURYBOAT);

            option = leer.nextInt();
        } while (option < 1 || option > 4);

        return option;
    }

    public Boat createBoat(int optionChosen) {

        ServiceCrear serviceCreate = new ServiceCrear();

        Boat newBoat = new Boat();

        switch (optionChosen) {
            case 1:

                newBoat = serviceCreate.CrearBoat();

                break;

            case 2:

                newBoat = serviceCreate.CrearSailBoat();

                break;

            case 3:

                newBoat = serviceCreate.CrearMotorBoat();

                break;

            case 4:

                newBoat = serviceCreate.CrearLuxuryYatchs();

                break;

            default:
                throw new AssertionError();
        }

        return newBoat;
    }

    public AlquilerDeAmarres rent(Boat boatToTieUp) {
        ServiceAlquiler serviceRent = new ServiceAlquiler();

        AlquilerDeAmarres newRent = serviceRent.CrearAlquilerDeAmarres(boatToTieUp);

        return newRent;
    }

}

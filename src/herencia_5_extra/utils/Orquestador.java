package herencia_5_extra.utils;

import herencia_5_extra.constant.Constant;
import herencia_5_extra.entity.AlquilerDeAmarres;
import herencia_5_extra.entity.Boat;

import herencia_5_extra.service.ServiceOrquestador;

/**
 *
 * @author franc
 */
public class Orquestador implements Constant {

    public static void metodoOrquestador() {

        ServiceOrquestador service = new ServiceOrquestador();

        int boatType = service.assignBoatTipe();

        Boat rentBoat = service.createBoat(boatType);


        AlquilerDeAmarres newRent = service.rent(rentBoat);

        System.out.println(PRICE + newRent.getRentalPrice());

    }

}

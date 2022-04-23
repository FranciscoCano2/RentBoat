/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_5_extra.service;

import herencia_5_extra.entity.AlquilerDeAmarres;
import herencia_5_extra.entity.Boat;
import herencia_5_extra.entity.SailBoat;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Scanner;


/**
 *
 * @author franc
 */
public class ServiceAlquiler {

    private final Scanner leer;

    public ServiceAlquiler() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public AlquilerDeAmarres CrearAlquilerDeAmarres(Boat newBoat) {

        AlquilerDeAmarres newAlquiler = new AlquilerDeAmarres();
        long time;
        double finalPrice;

        newAlquiler.setParkedBoat(newBoat);

        System.out.println("Nombre del Cliente:");
        newAlquiler.setName(leer.next());

        System.out.println("DNI:");
        newAlquiler.setDni(leer.nextInt());

        System.out.println("Posicion:");
        newAlquiler.setPosition(leer.next());

        System.out.println("Inicio de alquiler:");
        newAlquiler.setRentalDate(fechaAlquiler());
      

        System.out.println("Fin del Alquiler:");
        newAlquiler.setReturnDate(fechaAlquiler());


        time = DiasDeAlquiler(newAlquiler.getRentalDate(), newAlquiler.getReturnDate());

        System.out.println(time);

        System.out.println(newBoat.getPrecioBase());

        finalPrice = precioAlquiler(newBoat.getPrecioBase(), time);

        //System.out.println(finalPrice);
        newAlquiler.setRentalPrice(finalPrice);

        return newAlquiler;
    }

    protected LocalDate fechaAlquiler() {

        int dia, mes, anio;

        System.out.println("Dia:");
        dia = leer.nextInt();

        System.out.println("Mes:");
        mes = leer.nextInt();

        System.out.println("Año:");
        anio = leer.nextInt();

        LocalDate newDate = LocalDate.of(anio, mes, dia);

        return newDate;
    }

    protected long DiasDeAlquiler(LocalDate inicio, LocalDate fin) {

        long diasAlquilado= DAYS.between(inicio, fin);
     
        return diasAlquilado;
    }

    protected double precioAlquiler(double precioBase, long diasAlquilado) {

        double precioFinal;
        return precioFinal = precioBase * diasAlquilado;

    }
}

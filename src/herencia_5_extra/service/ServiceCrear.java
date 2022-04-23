package herencia_5_extra.service;

//import herencia_5_extra.constant.Constant;
import herencia_5_extra.entity.Boat;
import herencia_5_extra.entity.LuxuryYatchs;
import herencia_5_extra.entity.MotorBoat;
import herencia_5_extra.entity.SailBoat;
import java.util.Scanner;

/**
 *
 * @author franc
 */
//si extiendo la clase contantes me produce error en CrearBote
public class ServiceCrear {

    private final Scanner leer;

    public ServiceCrear() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Boat CrearBoat() {

        Boat standardBoat = new Boat();

        standardBoat.CrearBote();

       // System.out.println(standardBoat.getPrecioBase());

        return standardBoat;
    }

    public SailBoat CrearSailBoat() {

        SailBoat nuevoSailBoat = new SailBoat();

        nuevoSailBoat.CrearBote();

        System.out.println("Nº de Mastiles");
        nuevoSailBoat.setNumberMast(leer.nextInt());

        nuevoSailBoat.setPrecioBase(nuevoSailBoat.getPrecioBase() + nuevoSailBoat.getNumberMast());

        //System.out.println(nuevoSailBoat.getPrecioBase());

        return nuevoSailBoat;
    }

    public MotorBoat CrearMotorBoat() {

        MotorBoat nuevoMotorBoat = new MotorBoat();

        nuevoMotorBoat.CrearBote();

        System.out.println("Nº de CV");
        nuevoMotorBoat.setCv(leer.nextInt());

        nuevoMotorBoat.setPrecioBase(nuevoMotorBoat.getPrecioBase() + nuevoMotorBoat.getCv());

       // System.out.println(nuevoMotorBoat.getPrecioBase());

        return nuevoMotorBoat;
    }

    public LuxuryYatchs CrearLuxuryYatchs() {

        LuxuryYatchs nuevoYatch = new LuxuryYatchs();

        nuevoYatch.CrearBote();

        System.out.println("Nº de CV");
        nuevoYatch.setCv(leer.nextInt());

        System.out.println("Nº de Cabinas");
        nuevoYatch.setNumberCabins(leer.nextInt());

        nuevoYatch.setPrecioBase(nuevoYatch.getPrecioBase() + nuevoYatch.getCv() + nuevoYatch.getNumberCabins());

       // System.out.println(nuevoYatch.getPrecioBase());

        return nuevoYatch;
    }

}

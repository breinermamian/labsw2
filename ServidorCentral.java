
package servidorcentral;
import central.Servicio.centralServer;


public class ServidorCentral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        centralServer regSer = new centralServer();
        regSer.iniciar();
    }
    
}

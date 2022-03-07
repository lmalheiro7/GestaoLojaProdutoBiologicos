import com.sample.Cliente;
import com.sample.Codpostais;

public class main {
    public static void main(String args[]){
        com.sample.Codpostais c1 = new Codpostais();

        c1.setCodpostal(4);
        c1.setLocalidade("Bla bla bla");


        System.out.println("Vou guardar na base de dados o cod postal" + c1.getCodpostal() +
        " que tem a morada " + c1.getLocalidade());
    }
}

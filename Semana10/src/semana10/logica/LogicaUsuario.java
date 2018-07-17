
package semana10.logica;

import java.util.ArrayList;
import java.util.List;
import semana10.modelo.Usuario;


public class LogicaUsuario {
    public List<Usuario> obtenerUsuarios(){
         List<Usuario> list = new ArrayList<>();
         list.add(new Usuario("David" ,27));
         list.add(new Usuario("Pedro" ,25));
         list.add(new Usuario("Pepe" ,24));
         list.add(new Usuario("Juan" ,29));
        return list;
    }
}

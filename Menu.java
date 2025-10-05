import java.util.ArrayList;

public class Menu {
    private ArrayList<Usuario> menuUsuario = new ArrayList<>();

    public void adicionarMenu (Usuario u) {
           menuUsuario.add(u);
    };
    
    public void mostrarUsuarios () {
        for (Usuario u : menuUsuario){
            System.out.println(u.toString());
        }
    }
    public void apagarUsuario (String u){
        for (Usuario usuario : menuUsuario) {
            if (usuario.getNome().equals(u)) {
                menuUsuario.remove(usuario);
                break;
            }
        }
    }
}

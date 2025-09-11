public class Cadastramento {
    public static void main(String[] args) {
        Usuario neemias = new Usuario("nemias123@gmail.com", 92, 7755, "Neemias", "Macho", 19);

        neemias.logar(7755);
        neemias.verconta(7755);
        neemias.imprimir();
    }
}

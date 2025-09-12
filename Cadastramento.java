public class Cadastramento {
    public static void main(String[] args) {
        Usuario conta [] = new Usuario [3];
        conta [0] = new Usuario("samue123@gamil.com", 213, 1921, "Samuel", "Maculino", 18);
        conta [1] = new Usuario("Nemias", 123, 7799, "Neemias", "Masculino", 19);
        conta [2]= new Usuario("maria123@gmail.com", 123, 2299, "Maria", "Feminino", 32);

        //funcção
        conta [0].logar(1921);
        conta [1].logar(7799);
        conta [2].logar(2299);
        //impriminfo dados dos usuarios 
        conta [0].imprimir();
        conta [1].imprimir();
        conta [2].imprimir();
    
    }
}

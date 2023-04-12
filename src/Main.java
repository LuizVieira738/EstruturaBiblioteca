// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LivrosTecnicos eng1 = new LivrosTecnicos("Problemas e soluções", 30,"Zé carlos");
        LivrosNaoTecnicos lit1 = new LivrosNaoTecnicos("Dom Casmurro", 50, "Machado de Assis");
        Periodicos rev1 = new Periodicos("Veja!", 20, 40);


        eng1.imprimir();
        eng1.disponivel();
        eng1.consultar();
        eng1.imprimir();
        eng1.emprestar();
        eng1.imprimir();
        eng1.devolver();
        eng1.retornar();
        eng1.imprimir();
        eng1.reservar();
        eng1.emprestar();
        eng1.imprimir();











    }
}

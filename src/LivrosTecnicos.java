public class LivrosTecnicos extends Livros{

    private boolean reservado;

    public LivrosTecnicos(String titulo, int quantTotal, String autor) {
        super(titulo, quantTotal, autor);
        reservado = false;
    }

    @Override
    public boolean emprestar() {
        if (!reservado)
            return super.emprestar();
        else
            return false;
    }

    public void reservar(){
        reservado = true;
    }

    public void librerar(){
        reservado = false;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        if(reservado)
            System.out.println("RESERVADO!!");
    }
}

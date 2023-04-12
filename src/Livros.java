public abstract class  Livros extends Publicacoes {

    private String autor;
    private int emprestados;



    public Livros(String titulo, int quantTotal, String autor) {
        super(titulo, quantTotal);
        this.autor = autor;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Autor: "+autor+"\n"+
                "Cópias emprestadas: "+getEmprestados());
    }

    public int getEmprestados() {
        return emprestados;
    }

    public boolean emprestar(){

        if (getQuantDisp()>0 && getQuantDisp()<=getQuantTotal()){
            setQuantDisp(getQuantDisp()-1);
            emprestados++;
            return true;
        }
        return false;
    }

    public boolean devolver(){

        if (emprestados>0 && getQuantDisp()!=getQuantTotal()){
            setQuantDisp(getQuantDisp()+1);
            emprestados--;
        }

        return false;
    }

}

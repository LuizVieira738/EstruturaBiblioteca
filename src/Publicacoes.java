public abstract class Publicacoes {

    private String titulo;
    private int quantDisp, quantTotal,emConsulta;;

    public Publicacoes(String titulo, int quantTotal) {
        this.titulo = titulo;
        this.quantTotal = quantTotal;
        this.quantDisp = quantTotal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEmConsulta() {
        return emConsulta;
    }

    public int getQuantDisp() {
        return quantDisp;
    }

    public void setQuantDisp(int quantDisp) {
        this.quantDisp = quantDisp;
    }

    public int getQuantTotal() {
        return quantTotal;
    }

    public void setQuantTotal(int quantTotal) {
        this.quantTotal = quantTotal;
    }

    public void imprimir(){
        System.out.println("\nTítulo: " + titulo + "\n" +
        "Quantidade de cópias: " + quantTotal+"\n"+
        "Cópias disponíveis: "+getQuantDisp()+"\n"+
        "Cópias em consulta: "+getEmConsulta());
    }

    public boolean disponivel() {
        return getQuantDisp()>0 && getQuantDisp()<=getQuantTotal();
    }


    public boolean consultar() {
        if(getQuantDisp()>0 && getQuantDisp()<=getQuantTotal()){
            setQuantDisp(getQuantDisp()-1);
            emConsulta++;
            return true;
        }
        else
            return false;
    }

    public boolean retornar() {
        if (emConsulta>0 && getQuantDisp()!=getQuantTotal()){
            setQuantDisp(getQuantDisp()+1);
            emConsulta--;
            return true;
        }
        return false;
    }

}

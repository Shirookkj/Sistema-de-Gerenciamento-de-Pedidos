public class Mesa {
    private int numero;
    private boolean disponivel;


     public Mesa(int numero){
         this.numero = numero;
         this.disponivel = true;
     }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


}

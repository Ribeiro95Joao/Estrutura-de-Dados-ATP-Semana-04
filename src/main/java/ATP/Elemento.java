package ATP;

public class Elemento {
    private int num;
    private Elemento proximo;

//Método construtor
    public Elemento(){
        num = 0;
        proximo = null;
    }

    //Métodos Get e Set


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}

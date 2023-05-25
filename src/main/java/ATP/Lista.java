package ATP;
import java.util.Scanner;
public class Lista {
    public Elemento primeiro;
    public Elemento ultimo;
    public int qtd = 0;
    public static Scanner teclado = new Scanner(System.in);
    
    public void removeFinal(){
        //Método para remover o último elemento da lista
        Elemento aux = primeiro;
        Elemento ant = primeiro;
        if (qtd == 0){
            System.out.print("Lista vazia!!");
        }else {
            while (aux.getProximo() != null) {
                ant = aux;
                aux = aux.getProximo();
            }
            ant.setProximo(null);
            ultimo = ant;
            qtd--;
        }
    }

    public void removeInicio(){
        //Método para remover o primeiro elemento da lista
        if (qtd == 0){
            System.out.print("Lista vazia!!");
        }else{
            primeiro = primeiro.getProximo();
            qtd--;
        }
    }

    public void pesquisar(){
        //Método para procurar elementos na lista
        System.out.print("Qual elemento você deseja encontrar?");
        int numero = teclado.nextInt();
        Elemento aux = primeiro;
        while(aux != null && aux.getNum() != numero){
            aux = aux.getProximo();
        }
        if(aux == null){
            System.out.print("Elemento não encontrado.");
        }else{
            System.out.print("Elemento encontrado: " + aux.getNum());
        }
    }

    public void listar(){
        //Método para listar os elementos da lista
        Elemento aux = primeiro;
        if(aux == null){
            System.out.print("Lista vazia!!");
        }else{
            while(aux != null){
                System.out.print(aux.getNum() + ", ");
                aux = aux.getProximo();
            }
            System.out.println();
        }
    }

    public void adicionarPrimeiro(){
        //Método para adicionar objetos ao início da lista
        Elemento auxiliar = new Elemento();
        System.out.println("Informe o número desejado: ");
        auxiliar.setNum(teclado.nextInt());
        auxiliar.setProximo(primeiro);
        primeiro = auxiliar;
    }

    public void adicionarUltimo(){
        //Método para adicionar objetos ao final da lista
        Elemento novoObj = new Elemento();
        Elemento objAux = new Elemento();
        if(qtd == 0){
            //Método utilizado caso a lista esteja vazia
            System.out.println("Informe o número desejado: ");
            novoObj.setNum(teclado.nextInt());
            novoObj.setProximo(null);

            primeiro = novoObj;
            ultimo = novoObj;
            qtd++;
        }else{
            //Método utilizado caso a lista já possua objetos
            objAux = primeiro;
            while(objAux.getProximo() != null){
                objAux = objAux.getProximo();
            }

            System.out.println("Informe o número desejado: ");
            novoObj.setNum(teclado.nextInt());
            novoObj.setProximo(null);

            objAux.setProximo(novoObj);
            ultimo = novoObj;
            qtd++;
        }
    }

    public boolean isVazia(){
       return qtd == 0;
    }
}

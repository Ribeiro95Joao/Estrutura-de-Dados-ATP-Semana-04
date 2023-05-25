package ATP;
import java.util.Scanner;
public class Main {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.qtd = 0;

        addObjeto(lista);
        addObjeto(lista);
    }

    public static void removeFinal(Lista lista){
        Elemento aux = lista.primeiro;
        Elemento ant = lista.primeiro;
        if (lista.qtd == 0){
            System.out.print("Lista vazia!!");
        }else {
            while (aux.proximo != null) {
                ant = aux;
                aux = aux.proximo;
            }
            ant.proximo = null;
            lista.ultimo = ant;
            lista.qtd--;
        }
    }

    public static void removeInicio(Lista lista){
        if (lista.qtd == 0){
            System.out.print("Lista vazia!!");
        }else{
            lista.primeiro = lista.primeiro.proximo;
            lista.qtd--;
        }
    }

    public static void pesquisar(Lista lista){
        System.out.print("Qual elemento você deseka encontrar?");
        int numero = teclado.nextInt();
        Elemento aux = lista.primeiro;
        while(aux != null && aux.num != numero){
            aux = aux.proximo;
        }
        if(aux == null){
            System.out.print("Elemento não encontrado.");
        }else{
            System.out.print("Elemento encontrado: " + aux.num);
        }
    }

    public static void listar(Lista lista){
        Elemento aux = lista.primeiro;
        if(aux == null){
            System.out.print("Lista vazia!!");
        }else{
            while(aux != null){
                System.out.print(aux.num + ", ");
                aux = aux.proximo;
            }
            System.out.println();
        }
    }

    public static void addObjeto(Lista lista){
        //Método para adicionar objetos a lista
        Elemento novoObj = new Elemento();
        Elemento objAux = new Elemento();
        if(lista.qtd == 0){
            //Método utilizado caso a lista esteja vazia
            System.out.println("Informe o número desejado: ");
            novoObj.num = teclado.nextInt();
            novoObj.proximo = null;

            lista.primeiro = novoObj;
            lista.ultimo = novoObj;
            lista.qtd++;
        }else{
            //Método utilizado caso a lista já possua objetos
            objAux = lista.primeiro;
            while(objAux.proximo != null){
                objAux = objAux.proximo;
            }

            System.out.println("Informe o número desejado: ");
            novoObj.num = teclado.nextInt();
            novoObj.proximo = null;

            objAux.proximo = novoObj;
            lista.ultimo = novoObj;
            lista.qtd++;
        }
    }
}
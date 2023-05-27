package ATP;
import java.util.Scanner;
public class Main {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Lista l = new Lista();

        System.out.println(l.isVazia());
        l.listar();
        l.adicionarUltimo();
        l.adicionarUltimo();
        l.adicionarUltimo();
        l.adicionarUltimo();
        l.adicionarUltimo();
        l.listar();
        l.adicionarPrimeiro();
        l.adicionarPrimeiro();
        l.listar();
        l.removeFinal();
        l.removeInicio();
        l.listar();
        l.pesquisar();
        l.listar();
        System.out.println(l.isVazia());


    }

}
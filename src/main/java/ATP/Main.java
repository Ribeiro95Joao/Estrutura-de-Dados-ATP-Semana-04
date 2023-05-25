package ATP;
import java.util.Scanner;
public class Main {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Lista l = new Lista();

        l.adicionarUltimo();
        l.adicionarUltimo();
        l.adicionarUltimo();
        l.adicionarUltimo();
        l.adicionarUltimo();
        l.adicionarPrimeiro();
        l.adicionarPrimeiro();
        l.removeFinal();
        l.removeInicio();
        l.listar();
        l.isVazia();


    }

}
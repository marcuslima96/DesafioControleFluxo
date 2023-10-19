package controle;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Jhansen Barreto
 */
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametro1 = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametro2 = terminal.nextInt();

            contar(parametro1, parametro2);

        } catch (NoSuchElementException | IllegalStateException e) {
            System.out.println("Os parâmetros só aceitam números inteiros");

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 < parametro2) {
            for (int i = 0; i < (parametro2 - parametro1); i++) {
                System.out.println("Imprimindo o número " + (i + 1));
            }
            return;
        }
        throw new ParametrosInvalidosException();
    }
}

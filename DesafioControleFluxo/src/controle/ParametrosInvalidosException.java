package controle;

/**
 *
 * @author Jhansen Barreto
 */
public class ParametrosInvalidosException extends RuntimeException {

    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro.");
    }
}

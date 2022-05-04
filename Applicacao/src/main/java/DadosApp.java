public class DadosApp {

    private static final DadosApp instancia = new DadosApp();        // static = a clase tem o atributo instancia, o atributo esta a nivel da clase e nao ao nivel de outras classes
    private Conta conta;

    private DadosApp(){
        conta = new Conta();
        conta.adicionarRecibimento(750,"ordenado");
        conta.adicionarDespesa(100,"jantarada");
    }

    public static DadosApp getInstancia(){
        return instancia;
    }

    public Conta getConta() {
        return conta;
    }
}

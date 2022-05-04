import java.util.LinkedList;

public class Conta {

    private LinkedList<Transacao> transacoes;

    public Conta(){
        transacoes = new LinkedList<>();
    }

    public LinkedList<Transacao> getTransacoes() {
        return transacoes;
    }

    public int size(){
        return transacoes.size();
    }

    //Requisito 1
    public void adicionarDespesa(int montante, String descricao){
        transacoes.add(new Transacao(montante,descricao,true));
    }

    //Requisito 2
    public void adicionarRecibimento(int montante, String descricao){
        transacoes.add(new Transacao(montante,descricao,false));
    }

    //Requisito 3
    public int getSaldo(){
        int saldo = 0;
        for (Transacao transacao : transacoes) {
            if(transacao.isDespesa()){
                saldo -= transacao.getMontante();
            }else{
                saldo += transacao.getMontante();
            }
        }
        return saldo;
    }
}

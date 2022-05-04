import javax.swing.*;

public class MostrarSaldo extends JFrame{

    private JLabel textSaldo;
    private JPanel mainPanel;

    public MostrarSaldo(){
        setContentPane(mainPanel);
        pack();
        atualizarSaldo();
    }

    public void atualizarSaldo(){
        DadosApp da = DadosApp.getInstancia();
        textSaldo.setText(da.getConta().getSaldo()+" EUR");
    }

    public static void main(String[] args) {
        new MostrarSaldo().setVisible(true);
    }
}

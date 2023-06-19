package src.main.java.com.models.servico;

import src.main.java.com.interfaces.statusServico.StatusServico;

public class Servico implements StatusServico{
    private String nomeCliente, imei;
    private double valor;
    private String dataEntrada, dataSaida, defeito;
    private boolean finalizado;

    public Servico(String nomeCliente, String imei, double valor, String dataEntrada, String dataSaida, String defeito,
            boolean finalizado) {
        this.nomeCliente = nomeCliente;
        this.imei = imei;
        this.valor = valor;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.defeito = defeito;
        this.finalizado = finalizado;
    }

    @Override
    public boolean statusServico() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'statusServico'");
    }
}

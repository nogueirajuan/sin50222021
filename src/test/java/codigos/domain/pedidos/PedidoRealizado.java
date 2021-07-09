package codigos.domain.pedidos;

import java.io.Serializable;

public class PedidoRealizado implements Serializable {

    private Boolean primeiraCompra;
    private String tipoCliente;
    private float valorCompra;

    public PedidoRealizado(Boolean primeiraCompra, String tipoCliente, float valorCompra) {
        this.primeiraCompra = primeiraCompra;
        this.tipoCliente = tipoCliente;
        this.valorCompra = valorCompra;
    }

    public Boolean getPrimeiraCompra() {
        return primeiraCompra;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public Float getValorCompra() {
        return valorCompra;
    }
}

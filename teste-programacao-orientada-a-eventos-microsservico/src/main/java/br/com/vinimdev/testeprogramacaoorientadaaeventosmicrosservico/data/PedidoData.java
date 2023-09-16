package br.com.vinimdev.testeprogramacaoorientadaaeventosmicrosservico.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PedidoData {
    private String codigo;
    private String nomeProduto;
    private BigDecimal valor;
}

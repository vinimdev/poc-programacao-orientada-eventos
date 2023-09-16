package br.com.vinimdev.testeprogramacaoorientadaaeventos.controller;

import br.com.vinimdev.testeprogramacaoorientadaaeventos.data.PedidoData;
import br.com.vinimdev.testeprogramacaoorientadaaeventos.service.RegistraEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class PedidosController {

    private final RegistraEventoService eventoService;

    @PostMapping(value = "/salva-pedido")
    public ResponseEntity<String> salvarPedido(@RequestBody PedidoData pedido) {
        eventoService.adicionarEvento("salvarPedido", pedido);
        return ResponseEntity.ok("Sucesso");
    }
}

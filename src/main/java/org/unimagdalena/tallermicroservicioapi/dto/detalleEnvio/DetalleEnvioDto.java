package org.unimagdalena.tallermicroservicioapi.dto.detalleEnvio;

import org.unimagdalena.tallermicroservicioapi.dto.pedido.PedidoDto;

import java.util.UUID;

public record DetalleEnvioDto(
        UUID id,
        String direccion,
        String transportadora,
        Integer numeroGuia,
        PedidoDto pedido
) {
}

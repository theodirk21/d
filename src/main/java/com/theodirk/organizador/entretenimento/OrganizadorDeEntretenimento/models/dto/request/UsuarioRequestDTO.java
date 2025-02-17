package com.theodirk.organizador.entretenimento.OrganizadorDeEntretenimento.models.dto.request;

import com.theodirk.organizador.entretenimento.OrganizadorDeEntretenimento.models.entity.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UsuarioRequestDTO {

    private Usuario usuario;
    private List<String> grupos;
}

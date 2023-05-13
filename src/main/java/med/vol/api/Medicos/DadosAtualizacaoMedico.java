package med.vol.api.Medicos;

import jakarta.validation.constraints.NotNull;
import med.vol.api.Endereco.Endereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        Endereco endenreco) { }

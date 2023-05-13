package med.vol.api.Medicos;

import med.vol.api.Endereco.Endereco;

public record DadosCadastroMedico(String nome, String email, String telefone,String crm, Especialidade especialidade, Endereco endereco) {
}

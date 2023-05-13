package med.vol.api.Medicos;

public record DadosListagemMedica(Long id, String nome, String email, String telefone, String crm, Especialidade especialidade) {

    public DadosListagemMedica(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getTelefone(), medico.getCrm(), medico.getEspecialidade());
    }

}

package med.voll.api.paciente;

public record DadosListagemPaciente(String nome, String email, String cpf, String telefone) {
    public DadosListagemPaciente (Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getTelefone());
    }
}

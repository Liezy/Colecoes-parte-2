package pacote;

public class PessoaFisica implements Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }
}
package pacote;

public class PessoaJuridica implements Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
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

    public String getCnpj() {
        return cnpj;
    }
}
package br.com.Vitor_Ozorio.Loja_Crud.model.pessoas;

public class Funcionario extends Pessoa {

    private char id;
    private int login;
    private String cargo;

    public Funcionario(int cpf, String nome, String endereco, String telefone, char id, int login, String cargo) {
        super(cpf, nome, endereco, telefone);
        this.id = id;
        this.login = login;
        this.cargo = cargo;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                '}';
    }
}

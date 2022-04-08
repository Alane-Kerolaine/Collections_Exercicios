package Model;

import java.util.Scanner;

public class Pessoa {
    private Long id;
    private String nome;
    private String dataNascimento;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void adicionarPessoa(){
        Scanner scan = new Scanner(System.in);
        System.out.println("----- ADICIONAR PESSOA -----");
        System.out.println("Nome: ");
        setNome(scan.nextLine());
        System.out.println("Data de nascimento: ");
        setDataNascimento(scan.nextLine());
        System.out.println("Email: ");
        setEmail(scan.nextLine());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

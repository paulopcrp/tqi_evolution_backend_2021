package com.github.paulopcrp;

import java.util.Objects;

public class Endereco {
    private Long idEndereco;
    private String uf;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private Cliente cliente;


    public Endereco() {

    }

    public Endereco(Long idEndereco, String uf, String cidade, String bairro, String rua, int numero, Cliente cliente) {
        this.idEndereco = idEndereco;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cliente = cliente;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getPessoa() {
        return cliente;
    }

    public void setPessoa(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return numero == endereco.numero && Objects.equals(idEndereco, endereco.idEndereco) && Objects.equals(uf, endereco.uf) && Objects.equals(cidade, endereco.cidade) && Objects.equals(bairro, endereco.bairro) && Objects.equals(rua, endereco.rua) && Objects.equals(cliente, endereco.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEndereco, uf, cidade, bairro, rua, numero, cliente);
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "idEndereco=" + idEndereco +
                ", uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", pessoa=" + cliente +
                '}';
    }
}

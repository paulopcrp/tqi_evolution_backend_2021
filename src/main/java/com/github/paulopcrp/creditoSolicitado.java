package com.github.paulopcrp;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class creditoSolicitado {

    private Long idEmprestimo;
    private Double Creditovalor;
    private Date dataPrimeiraParcela;
    private int quantidadeParcelas;
    private List<numeroParcelas> numeroParcelas;


    public creditoSolicitado() {

    }


    public creditoSolicitado(Long idEmprestimo, Double Creditovalor,
                             Date dataPrimeiraParcela, int quantidadeParcelas,
                             List<numeroParcelas> numeroParcelas) {
        this.idEmprestimo = idEmprestimo;
        this.Creditovalor = Creditovalor;
        this.dataPrimeiraParcela = dataPrimeiraParcela;
        this.quantidadeParcelas = quantidadeParcelas;
        this.numeroParcelas = numeroParcelas;
    }


    public Long getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(Long idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Double getCreditovalor() {
        return Creditovalor;
    }

    public void setCreditovalor(Double creditovalor) {
        this.Creditovalor = creditovalor;
    }

    public Date getDataPrimeiraParcela() {
        return dataPrimeiraParcela;
    }

    public void setDataPrimeiraParcela(Date dataPrimeiraParcela) {
        this.dataPrimeiraParcela = dataPrimeiraParcela;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public List<numeroParcelas> getParcelasEmprestimos() {
        return numeroParcelas;
    }

    public void setParcelasEmprestimos(List<numeroParcelas> numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        creditoSolicitado that = (creditoSolicitado) o;
        return quantidadeParcelas == that.quantidadeParcelas && Objects.equals(idEmprestimo, that.idEmprestimo) && Objects.equals(Creditovalor, that.Creditovalor) && Objects.equals(dataPrimeiraParcela, that.dataPrimeiraParcela) && Objects.equals(numeroParcelas, that.numeroParcelas);
    }


    @Override
    public int hashCode() {
        return Objects.hash(idEmprestimo, Creditovalor, dataPrimeiraParcela, quantidadeParcelas, numeroParcelas);
    }


    @Override
    public String toString() {
        return "Emprestimo{" +
                "idEmprestimo=" + idEmprestimo +
                ", valorEmprestimo=" + Creditovalor +
                ", dataPrimeiraParcela=" + dataPrimeiraParcela +
                ", quantidadeParcelas=" + quantidadeParcelas +
                ", parcelasEmprestimos=" + numeroParcelas +
                '}';
    }
}

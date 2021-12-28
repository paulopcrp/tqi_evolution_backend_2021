package com.github.paulopcrp;

import java.util.Date;
import java.util.Objects;

public class numeroParcelas {

    private Long idParcela;
    private Date dataVencimento;
    private String observacao;
    private creditoSolicitado creditoSolicitado;


    public numeroParcelas() {

    }

    public numeroParcelas(Long idParcela, Date dataVencimento, String observacao, creditoSolicitado creditoSolicitado) {
        this.idParcela = idParcela;
        this.dataVencimento = dataVencimento;
        this.observacao = observacao;
        this.creditoSolicitado = creditoSolicitado;
    }


    public Long getIdParcela() {
        return idParcela;
    }

    public void setIdParcela(Long idParcela) {
        this.idParcela = idParcela;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public creditoSolicitado getEmprestimo() {
        return creditoSolicitado;
    }

    public void setEmprestimo(creditoSolicitado creditoSolicitado) {
        this.creditoSolicitado = creditoSolicitado;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        numeroParcelas that = (numeroParcelas) o;
        return Objects.equals(idParcela, that.idParcela) && Objects.equals(dataVencimento, that.dataVencimento) && Objects.equals(observacao, that.observacao) && Objects.equals(creditoSolicitado, that.creditoSolicitado);
    }


    @Override
    public int hashCode() {
        return Objects.hash(idParcela, dataVencimento, observacao, creditoSolicitado);
    }

    @Override
    public String toString() {
        return "ParcelasEmprestimo{" +
                "idParcela=" + idParcela +
                ", dataVencimento=" + dataVencimento +
                ", observacao='" + observacao + '\'' +
                ", emprestimo=" + creditoSolicitado +
                '}';
    }
}

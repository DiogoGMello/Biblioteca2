package model.bean;

import java.sql.Date;

public class Emprestimo {
    private int idEmprestimo;
    private int clienteID;
    private int exemplarID;
    private Date dataEmprestimo;
    private Date dataDevPrevista;
    private Date dataDevEfetiva;
    private int funcionarioID;
    private boolean statusEmprestimo;

    public Emprestimo(){
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public int getExemplarID() {
        return exemplarID;
    }

    public void setExemplarID(int exemplarID) {
        this.exemplarID = exemplarID;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevPrevista() {
        return dataDevPrevista;
    }

    public void setDataDevPrevista(Date dataDevPrevista) {
        this.dataDevPrevista = dataDevPrevista;
    }

    public Date getDataDevEfetiva() {
        return dataDevEfetiva;
    }

    public void setDataDevEfetiva(Date dataDevEfetiva) {
        this.dataDevEfetiva = dataDevEfetiva;
    }

    public int getFuncionarioID() {
        return funcionarioID;
    }

    public void setFuncionarioID(int funcionarioID) {
        this.funcionarioID = funcionarioID;
    }

    public boolean isStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void setStatusEmprestimo(boolean statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }
}

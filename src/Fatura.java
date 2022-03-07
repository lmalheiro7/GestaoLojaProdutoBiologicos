package com.sample;


public class Fatura {

  private long numfatura;
  private long idcliente;
  private long idcolaborador;
  private long identrega;
  private java.sql.Date data;
  private double valorfatura;


  public long getNumfatura() {
    return numfatura;
  }

  public void setNumfatura(long numfatura) {
    this.numfatura = numfatura;
  }


  public long getIdcliente() {
    return idcliente;
  }

  public void setIdcliente(long idcliente) {
    this.idcliente = idcliente;
  }


  public long getIdcolaborador() {
    return idcolaborador;
  }

  public void setIdcolaborador(long idcolaborador) {
    this.idcolaborador = idcolaborador;
  }


  public long getIdentrega() {
    return identrega;
  }

  public void setIdentrega(long identrega) {
    this.identrega = identrega;
  }


  public java.sql.Date getData() {
    return data;
  }

  public void setData(java.sql.Date data) {
    this.data = data;
  }


  public double getValorfatura() {
    return valorfatura;
  }

  public void setValorfatura(double valorfatura) {
    this.valorfatura = valorfatura;
  }

}

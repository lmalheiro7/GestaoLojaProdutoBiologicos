package com.sample;


public class Moradaentrega {

  private long identrega;
  private long codpostal;
  private java.sql.Date horaentrega;
  private java.sql.Date dataentrega;
  private String rua;
  private long numporta;


  public long getIdentrega() {
    return identrega;
  }

  public void setIdentrega(long identrega) {
    this.identrega = identrega;
  }


  public long getCodpostal() {
    return codpostal;
  }

  public void setCodpostal(long codpostal) {
    this.codpostal = codpostal;
  }


  public java.sql.Date getHoraentrega() {
    return horaentrega;
  }

  public void setHoraentrega(java.sql.Date horaentrega) {
    this.horaentrega = horaentrega;
  }


  public java.sql.Date getDataentrega() {
    return dataentrega;
  }

  public void setDataentrega(java.sql.Date dataentrega) {
    this.dataentrega = dataentrega;
  }


  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }


  public long getNumporta() {
    return numporta;
  }

  public void setNumporta(long numporta) {
    this.numporta = numporta;
  }

}

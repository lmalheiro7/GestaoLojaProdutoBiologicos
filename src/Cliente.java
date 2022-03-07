package com.sample;


public class Cliente {

  private long idcliente;
  private long idtipocliente;
  private long codpostal;
  private String nome;
  private long telefone;
  private long numporta;
  private String rua;


  public long getIdcliente() {
    return idcliente;
  }

  public void setIdcliente(long idcliente) {
    this.idcliente = idcliente;
  }


  public long getIdtipocliente() {
    return idtipocliente;
  }

  public void setIdtipocliente(long idtipocliente) {
    this.idtipocliente = idtipocliente;
  }


  public long getCodpostal() {
    return codpostal;
  }

  public void setCodpostal(long codpostal) {
    this.codpostal = codpostal;
  }


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }


  public long getTelefone() {
    return telefone;
  }

  public void setTelefone(long telefone) {
    this.telefone = telefone;
  }


  public long getNumporta() {
    return numporta;
  }

  public void setNumporta(long numporta) {
    this.numporta = numporta;
  }


  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

}

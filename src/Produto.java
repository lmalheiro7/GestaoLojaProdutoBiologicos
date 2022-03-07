package com.sample;


public class Produto {

  private long numproduto;
  private long idtipoproduto;
  private String nome;
  private long quantidademinima;
  private long quantidadestock;
  private double valorunitario;


  public long getNumproduto() {
    return numproduto;
  }

  public void setNumproduto(long numproduto) {
    this.numproduto = numproduto;
  }


  public long getIdtipoproduto() {
    return idtipoproduto;
  }

  public void setIdtipoproduto(long idtipoproduto) {
    this.idtipoproduto = idtipoproduto;
  }


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }


  public long getQuantidademinima() {
    return quantidademinima;
  }

  public void setQuantidademinima(long quantidademinima) {
    this.quantidademinima = quantidademinima;
  }


  public long getQuantidadestock() {
    return quantidadestock;
  }

  public void setQuantidadestock(long quantidadestock) {
    this.quantidadestock = quantidadestock;
  }


  public double getValorunitario() {
    return valorunitario;
  }

  public void setValorunitario(double valorunitario) {
    this.valorunitario = valorunitario;
  }

}

package br.com.maria.diabeteShop.diabeteShop_maria.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class pedidos {

	private Long idVenda;
	private Long clienteIdCliente;
	private Long vendedorIdVendedor;
	private String nomeCliente;
	private String nomeVendedor;
	private String formaPagamento;
	private Calendar dataVenda;
	private int cartao;
	private float dinheiro;
	private Long produtoIdProduto[];
	private int quantidade[];
	private double impostoArrecadado;
	private double valorTotalVendas;
	private List<pedidos> pedidos = new ArrayList<pedidos>(); 

	private String produtoNome;
	private int quantidadeComprada;
	private double preco;
	private double valorTotal;
	private double subTotal;
	private double totalVenda;
	private final double imposto=0.12;

	public Long getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Long idVenda) {
		this.idVenda = idVenda;
	}

	public Long getClienteIdCliente() {
		return clienteIdCliente;
	}

	public void setClienteIdCliente(Long clienteIdCliente) {
		this.clienteIdCliente = clienteIdCliente;
	}

	public Long getVendedorIdVendedor() {
		return vendedorIdVendedor;
	}

	public void setVendedorIdVendedor(Long vendedorIdVendedor) {
		this.vendedorIdVendedor = vendedorIdVendedor;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Calendar getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Calendar dataVenda) {
		this.dataVenda = dataVenda;
	}

	public int getCartao() {
		return cartao;
	}

	public void setCartao(int cartao) {
		this.cartao = cartao;
	}

	public float getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(float dinheiro) {
		this.dinheiro = dinheiro;
	}

	public Long[] getProdutoIdProduto() {
		return produtoIdProduto;
	}

	public void setProdutoIdProduto(Long produtoIdProduto[]) {
		this.produtoIdProduto = produtoIdProduto;
	}

	public int[] getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade[]) {
		this.quantidade = quantidade;
	}

	public List<pedidos> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<pedidos> pedidos) {
		this.pedidos = pedidos;
	}

	public double getImpostoArrecadado() {
		return impostoArrecadado;
	}

	public void setImpostoArrecadado(double impostoArrecadado) {
		this.impostoArrecadado = impostoArrecadado;
	}

	public double getValorTotalVendas() {
		return valorTotalVendas;
	}

	public void setValorTotalVendas(double valorTotalVendas) {
		this.valorTotalVendas = valorTotalVendas;
	}	




	public String getProdutoNome() {
		return produtoNome;
	}

	public void setProdutoNome(String produtoNome) {
		this.produtoNome = produtoNome;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getValorTotal() {
		valorTotal = preco*quantidadeComprada;
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getTotalVendaComImposto() {
		totalVenda = this.getSubTotal() + this.getSubTotal()*this.getImposto();
		return totalVenda;
	}

	public void setTotalVendaComImposto(double totalVenda) {
		this.totalVenda = totalVenda;
	}

	public double getSubTotal() {	
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getImposto() {
		return imposto;
	}

	public double getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}
}
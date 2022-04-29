package br.com.maria.diabeteShop.diabeteShop_maria.model;

import java.util.Calendar;

public class produto {
    
        private Long idProduto;
        private String nome;
        private String marca;
        private float altura;
        private float largura;
        private float profundidade;
        private Double preco;
        private Calendar dataCadastro;
        private float volumeTotal;
        private String tipoProduto;
        private float peso;
        private Double precoDeVenda;
            

        public Long getIdProduto() {
            return idProduto;
        }
    
        public void setIdProduto(Long idProduto) {
            this.idProduto = idProduto;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getMarca() {
            return marca;
        }
    
        public void setMarca(String marca) {
            this.marca = marca;
        }
    
        public float getAltura() {
            return altura;
        }
    
        public void setAltura(float altura) {
            this.altura = altura;
        }
    
        public float getLargura() {
            return largura;
        }
    
        public void setLargura(float largura) {
            this.largura = largura;
        }
    
        public float getProfundidade() {
            return profundidade;
        }
    
        public void setProfundidade(float profundidade) {
            this.profundidade = profundidade;
        }
        
        public Double getPreco() {
            return preco;
        }
    
        public void setPreco(Double preco) {
            this.preco = preco;
        }
        public Calendar getDataCadastro() {
            return dataCadastro;
        }
        public void setDataCadastro(Calendar dataCadastro) {
            this.dataCadastro = dataCadastro;
        }

        /*UserStory 17 Volume do produto*/
        public float getVolumeTotal() {
            volumeTotal = altura*largura*profundidade;
            return volumeTotal;
        }
    
        public void setVolumeTotal(float volumeTotal) {
            this.volumeTotal = volumeTotal;
        }
    
        public String getTipoProduto() {
            return tipoProduto;
        }
    
        public void setTipoProduto(String tipoProduto) {
            this.tipoProduto = tipoProduto;
        }
        public float getPeso() {
            return peso;
        }
    
        public void setPeso(float peso) {
            this.peso = peso;
        }
        
        public Double getPrecoDeVenda() {
            return precoDeVenda;
        }
    
        public void setPrecoDeVenda(Double precoDeVenda) {
            this.precoDeVenda = precoDeVenda;
        }
        
}
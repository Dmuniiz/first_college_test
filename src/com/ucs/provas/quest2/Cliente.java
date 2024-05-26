package com.ucs.provas.quest2;

import javax.swing.JOptionPane;

public class Cliente {

	private String nome;
	private double desconto;
	private double compra;

	public Cliente(String nome) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		desconto = 0;
		compra = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getCompra() {
		return compra;
	}

	public void setCompra(double compra) {
		this.compra = compra;
	}

	public void aumentaCompra(double valorCompra) {
		this.compra += valorCompra;
	}

	public void mudaDesconto() {
		if (this.compra >= 5000) {
			this.desconto = 0.10;

		} else if (this.compra < 5000 && this.compra > 1000) {
			this.desconto = 0.05;

		} else {
			this.desconto = 0;
		}
	}

	public double indicaDesconto() {
		return this.compra * this.desconto;
	}

	public void mostrarDados() {
		JOptionPane.showMessageDialog(null, "Nome: " + this.nome + "\nDesconto: " + (this.desconto * 100) + "%");
	}

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog(null, "Informe o nome do cliente");
		Cliente c1 = new Cliente(nome);

		double valoresItens = 1;
		int i = 1;
		while (valoresItens != 0) {
			valoresItens = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do item " + i + "(Digite 0 para finalizar)"));

			c1.aumentaCompra(valoresItens);
			i++;

		}
		
		c1.mudaDesconto();
		
		double desconto = c1.indicaDesconto();
		double valorFinal = c1.getCompra() - desconto;

		c1.mostrarDados();
		JOptionPane.showMessageDialog(null, "Valor final a pagar: " + valorFinal);
		
	}

}

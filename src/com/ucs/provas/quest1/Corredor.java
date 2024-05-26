package com.ucs.provas.quest1;

import javax.swing.JOptionPane;

public class Corredor {

	private String nome;
	private double nota;
	private int trofeus;

	public Corredor(String nome) {
		this.nome = nome;
		nota = 0;
		trofeus = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getTrofeus() {
		return trofeus;
	}

	public void setTrofeus(int trofeus) {
		this.trofeus = trofeus;
	}

	public void aumentaTrofeus(int quantidadeTrofeus) {
		this.trofeus += quantidadeTrofeus;
	}

	public String tipo() {
		if (this.trofeus > 5) {
			return "campeão";
		}
		return "normal";
	}

	public void mostrarDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Nota: " + this.nota);
		System.out.println("Troféus: " + this.trofeus);
	}

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null, "Digite o nome do Corredor: ");
		Corredor c1 = new Corredor(nome);

		c1.aumentaTrofeus(7);
		c1.aumentaTrofeus(3);

		double acumNotas = 0;
		for (int i = 1; i < 5; i++) {
			double notas = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota de desempenho" + i + ":"));
			acumNotas += notas;
		}

		c1.setNota(acumNotas);
		c1.mostrarDados();

	}

}

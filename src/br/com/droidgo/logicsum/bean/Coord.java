package br.com.droidgo.logicsum.bean;

import java.io.Serializable;

public class Coord implements Serializable{
	private int linha;
	private int coluna;
	
	public Coord(int linha, int coluna) {
		super();
		this.linha = linha;
		this.coluna = coluna;
	}

	public Coord() {
		super();
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	@Override
	public String toString() {
		return "[L[" + linha + "], C[" + coluna + "]]";
	}
	
	
}

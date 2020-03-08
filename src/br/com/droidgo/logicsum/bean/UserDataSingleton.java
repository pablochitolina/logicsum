package br.com.droidgo.logicsum.bean;

import java.io.Serializable;

import android.graphics.Typeface;

public class UserDataSingleton implements Serializable {
	private static UserDataSingleton instance;
	
	private Long score;
	private Typeface fonttype;
	private String packageDrawableBlock;
	private String packageDrawableBackground;
	private Boolean mostraMsg = false;
	private int numConquistas = 0;
	private String instrucao;
	
	public Boolean getMostraMsg() {
		return mostraMsg;
	}

	public void setMostraMsg(Boolean mostraMsg) {
		this.mostraMsg = mostraMsg;
	}

	public static UserDataSingleton getInstance() {
        if ( UserDataSingleton.instance == null ) {
        	UserDataSingleton.instance = new UserDataSingleton();
        }
        return UserDataSingleton.instance;
    }

	public UserDataSingleton() {
		super();
	}

	public String getInstrucao() {
		return instrucao;
	}

	public void setInstrucao(String instrucao) {
		this.instrucao = instrucao;
	}

	public int getNumConquistas() {
		return numConquistas;
	}

	public void setNumConquistas(int numConquistas) {
		this.numConquistas = numConquistas;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}
	
	public String getPackageDrawableBackground() {
		return packageDrawableBackground;
	}

	public void setPackageDrawableBackground(String packageDrawableBackground) {
		this.packageDrawableBackground = packageDrawableBackground;
	}

	public String getPackageDrawableBlock() {
		return packageDrawableBlock;
	}

	public void setPackageDrawableBlock(String packageDrawableBlock) {
		this.packageDrawableBlock = packageDrawableBlock;
	}

	public Typeface getFonttype() {
		return fonttype;
	}

	public void setFonttype(Typeface fonttype) {
		this.fonttype = fonttype;
	}

	@Override
	public String toString() {
		return "UserDataSingleton [score=" + score + "]";
	}
	
}

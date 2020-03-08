package br.com.droidgo.logicsum.bean;

import java.io.Serializable;

public class Struct implements Serializable{
	
	private String action;
	private String activity;
	
	
	public Struct(String action, String activity) {
		super();
		this.activity = activity;
		this.action = action;
	}

	public Struct() {
		super();
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Struct [activity=" + activity + ", action=" + action + "]";
	}
	
}

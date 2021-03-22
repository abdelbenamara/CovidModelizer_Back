package com.inf1.app.jpa.entities;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class CasSIRModel extends Modelisation{
	
	private int S, I, R, R0 ;

	public int getS() {
		return S;
	}

	public void setS(int s) {
		S = s;
	}

	public int getI() {
		return I;
	}

	public void setI(int i) {
		I = i;
	}

	public int getR() {
		return R;
	}

	public void setR(int r) {
		R = r;
	}

	public int getR0() {
		return R0;
	}

	public void setR0(int r0) {
		R0 = r0;
	}
	
	

}

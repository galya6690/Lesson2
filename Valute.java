package com.gmail.galya6690;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "valute")
public class Valute {
	private int numCode;
	private String charCode;
	private int nominal;
	private String name;
	private double value;

	public Valute() {
	}

	public Valute(int numCode, String charCode, int nominal, String name, double value) {
		this.numCode = numCode;
		this.charCode = charCode;
		this.nominal = nominal;
		this.name = name;
		this.value = value;
	}

	@XmlElement
	public int getNumCode() {
		return numCode;
	}

	public void setNumCode(int numCode) {
		numCode = numCode;
	}

	@XmlElement
	public String getCharCode() {
		return charCode;
	}

	public void setCharCode(String charCode) {
		charCode = charCode;
	}

	@XmlElement
	public int getNominal() {
		return nominal;
	}

	public void setNominal(int nominal) {
		nominal = nominal;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	@XmlElement
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		value = value;
	}
}

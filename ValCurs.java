package com.gmail.galya6690;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

import java.util.List;

@XmlRootElement(name = "valCurs")
public class ValCurs {
	@XmlElement(name = "valute")
	private List<Valute> values = new ArrayList<>();

	public ValCurs() {

		values = new ArrayList<Valute>();
	}

	public void add(Valute valute) {
		values.add(valute);
	}

	@Override
	public String toString() {
		return "ValCurs{" + "values=" + values + '}';
	}
}

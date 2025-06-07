/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since Jun 7, 2025
 */

package br.com.eaugusto.genericmodels;

public class Hyundai extends Car {

	public Hyundai(String model) {
		super(model, "Hyundai");
	}

	@Override
	public void showInformation() {
		System.out.println(getBrand() + " Car - Model: " + getModel());
	}
}

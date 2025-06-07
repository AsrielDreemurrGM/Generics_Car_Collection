/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since Jun 7, 2025
 */

package br.com.eaugusto.genericmodels;

public class Toyota extends Car {

	public Toyota(String model) {
		super(model, "Toyota");
	}

	@Override
	public void showInformation() {
		System.out.println(getBrand() + " Car - Model: " + getModel());
	}
}

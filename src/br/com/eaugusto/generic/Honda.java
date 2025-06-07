/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since Jun 7, 2025
 */

package br.com.eaugusto.generic;

public class Honda extends Car {

	public Honda(String model) {
		super(model, "Honda");
	}

	@Override
	public void showInformation() {
		System.out.println(getBrand() + " Car - Model: " + getModel());
	}
}

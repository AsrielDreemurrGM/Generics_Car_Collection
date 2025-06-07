/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since Jun 6, 2025
 */

package br.com.eaugusto.genericmodels;

public abstract class Car {
	private String model;
	private String brand;

	protected Car(String model, String brand) {
		this.setModel(model);
		this.setBrand(brand);
	}

	public abstract void showInformation();

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

}

/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since Jun 6, 2025
 */

package br.com.eaugusto.main;

import java.util.ArrayList;
import java.util.List;

import br.com.eaugusto.generic.Car;
import br.com.eaugusto.generic.Honda;
import br.com.eaugusto.generic.Hyundai;
import br.com.eaugusto.generic.Toyota;

public class App {

	public static void main(String[] args) {

		List<Car> carList = new ArrayList<>();

		carList.add(new Hyundai("HB20"));
		carList.add(new Honda("Civic"));
		carList.add(new Toyota("Corolla"));

		System.out.println("Printing carList With Wildcard");
		printCarList(carList);
	}

	public static void printCarList(List<? extends Car> carList) {
		for (Car car : carList) {
			car.showInformation();
		}
	}
}

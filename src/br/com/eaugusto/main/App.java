/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since Jun 6, 2025
 */

package br.com.eaugusto.main;

import java.util.ArrayList;
import java.util.List;

import br.com.eaugusto.genericmodels.Car;
import br.com.eaugusto.genericmodels.Honda;
import br.com.eaugusto.genericmodels.Hyundai;
import br.com.eaugusto.genericmodels.Toyota;

public class App {

	public static void main(String[] args) {

		List<Car> carList = new ArrayList<>();

		carList.add(new Hyundai("HB20"));
		carList.add(new Honda("Civic"));
		carList.add(new Toyota("Corolla"));

		for (Car eachCar : carList) {
			eachCar.showInformation();
		}
	}
}

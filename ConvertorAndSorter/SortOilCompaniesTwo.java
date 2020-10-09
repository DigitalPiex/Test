package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class SortOilCompaniesTwo {

	public static void main(String[] args) throws IOException {

		List<Station> stationList = new ArrayList<>();

		BufferedReader bufferedReader = new BufferedReader(new FileReader("text"));
		int totalCount = Integer.parseInt(bufferedReader.readLine());

		printStations(stationList, bufferedReader);

		bufferedReader.close();

	}

	private static void printStations(List<Station> stationList, BufferedReader bufferedReader) throws IOException {

		while (bufferedReader.ready()) {

			String[] company = bufferedReader.readLine().trim().split("\\s");
			Station tempStation = new Station(company[1], new ArrayList<>(), company[3]);

			if (stationList.contains(tempStation)) {

				tempStation = stationList.get(stationList.indexOf(tempStation));
				tempStation.getOilMark().add(company[2]);

			} else {

				tempStation.getOilMark().add(company[2]);
				stationList.add(tempStation);

			}

		}

		stationList = stationList.stream().filter(x -> x.getOilMark().size() == 3).collect(Collectors.toList());
		Collections.sort(stationList);
		stationList.forEach(x -> System.out.println(x.getAddress() + " " + x.getCompany()));

	}

}

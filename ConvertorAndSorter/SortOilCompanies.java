package test;

import java.io.*;
import java.util.*;

public class SortOilCompanies {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new FileReader("text"));
		int totalCount = Integer.parseInt(bufferedReader.readLine());

		TreeMap<String, ArrayList<String>> treeMap = new TreeMap<>();

		while (bufferedReader.ready()) {
			String[] company = bufferedReader.readLine().trim().split("\\s");
			String addressAndName = company[1] + " " + company[3];

			if (treeMap.containsKey(addressAndName)) {
			} else treeMap.put(addressAndName, new ArrayList<>());

			treeMap.get(addressAndName).add(company[2]);
		}

		bufferedReader.close();

		printStations(treeMap);

	}

	public static void printStations(TreeMap<String, ArrayList<String>> treeMap) {
		boolean stationNotFound = true;

		for (Map.Entry<String, ArrayList<String>> pair : treeMap.entrySet()) {
			String key = pair.getKey();
			ArrayList<String> value = pair.getValue();
			if (value.size() == 3) {
				System.out.println(key);
				stationNotFound = false;
			}
		}
		if (stationNotFound) System.out.println("Нет");
	}

}

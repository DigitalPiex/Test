package test;

import java.util.ArrayList;
import java.util.Objects;

public class Station implements Comparable<Station>{

	private String address;
	private ArrayList<String> oilMark;
	private String company;

	public Station() {

	}

	public Station(String address, ArrayList<String> oilMark, String company) {
		this.address = address;
		this.oilMark = oilMark;
		this.company = company;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<String> getOilMark() {
		return oilMark;
	}

	public void setOilMark(ArrayList<String> oilMark) {
		this.oilMark = oilMark;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Station station = (Station) o;
		return Objects.equals(address, station.address) &&
				Objects.equals(company, station.company);
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, company);
	}

	@Override
	public String toString() {
		return "Station = [" +
				"address='" + address + '\'' +
				", oilMark=" + oilMark +
				", company='" + company + '\'' +
				']';
	}

	@Override
	public int compareTo(Station station) {

		String thisStation = this.getAddress() + " " + this.getCompany();
		String newStation = station.getAddress() + " " + station.getCompany();

		return Integer.compare(thisStation.compareTo(newStation), 0);

	}
}

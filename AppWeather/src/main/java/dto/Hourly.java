package dto;

import java.util.List;

public class Hourly {
	private List<String> time;
	private List<Double> temperature_2m;
	private List<Integer> relativehumidity_2m;
	private List<Double> windspeed_10m;
	private List<Integer> precipitation_probability;

	public List<String> getTime() {
		return time;
	}

	public void setTime(List<String> time) {
		this.time = time;
	}

	public List<Double> getTemperature_2m() {
		return temperature_2m;
	}

	public void setTemperature_2m(List<Double> temperature_2m) {
		this.temperature_2m = temperature_2m;
	}

	public List<Integer> getRelativehumidity_2m() {
		return relativehumidity_2m;
	}

	public void setRelativehumidity_2m(List<Integer> relativehumidity_2m) {
		this.relativehumidity_2m = relativehumidity_2m;
	}

	public List<Double> getWindspeed_10m() {
		return windspeed_10m;
	}

	public void setWindspeed_10m(List<Double> windspeed_10m) {
		this.windspeed_10m = windspeed_10m;
	}

	public List<Integer> getPrecipitation_probability() {
		return precipitation_probability;
	}

	public void setPrecipitation_probability(List<Integer> precipitation_probability) {
		this.precipitation_probability = precipitation_probability;
	}

	@Override
	public String toString() {
		return "Hourly [time=" + time + ", temperature_2m=" + temperature_2m + ", relativehumidity_2m="
				+ relativehumidity_2m + ", windspeed_10m=" + windspeed_10m + ", precipitation_probability="
				+ precipitation_probability + "]";
	}

}
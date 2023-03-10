package dto;

public class HourlyUnits {
	private String time;
	private String temperature_2m;
	private String relativehumidity_2m;
	private String windspeed_10m;
	private String precipitation_probability;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTemperature_2m() {
		return temperature_2m;
	}

	public void setTemperature_2m(String temperature_2m) {
		this.temperature_2m = temperature_2m;
	}

	public String getRelativehumidity_2m() {
		return relativehumidity_2m;
	}

	public void setRelativehumidity_2m(String relativehumidity_2m) {
		this.relativehumidity_2m = relativehumidity_2m;
	}

	public String getWindspeed_10m() {
		return windspeed_10m;
	}

	public void setWindspeed_10m(String windspeed_10m) {
		this.windspeed_10m = windspeed_10m;
	}

	public String getPrecipitation_probability() {
		return precipitation_probability;
	}

	public void setPrecipitation_probability(String precipitation_probability) {
		this.precipitation_probability = precipitation_probability;
	}

	@Override
	public String toString() {
		return "HourlyUnits [time=" + time + ", temperature_2m=" + temperature_2m + ", relativehumidity_2m="
				+ relativehumidity_2m + ", windspeed_10m=" + windspeed_10m + ", precipitation_probability="
				+ precipitation_probability + "]";
	}

}
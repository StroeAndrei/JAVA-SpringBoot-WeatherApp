package dto;

public class Weather {
	private double latitude;
	private double longitude;
	private double generationtime_ms;
	private int utc_offset_seconds;
	private String timezone;
	private String timezone_abbreviation;
	private double elevation;

	CurrentWeather current_weather;

	HourlyUnits hourly_units;

	Hourly hourly;

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getGenerationtime_ms() {
		return generationtime_ms;
	}

	public void setGenerationtime_ms(double generationtime_ms) {
		this.generationtime_ms = generationtime_ms;
	}

	public int getUtc_offset_seconds() {
		return utc_offset_seconds;
	}

	public void setUtc_offset_seconds(int utc_offset_seconds) {
		this.utc_offset_seconds = utc_offset_seconds;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getTimezone_abbreviation() {
		return timezone_abbreviation;
	}

	public void setTimezone_abbreviation(String timezone_abbreviation) {
		this.timezone_abbreviation = timezone_abbreviation;
	}

	public double getElevation() {
		return elevation;
	}

	public void setElevation(double elevation) {
		this.elevation = elevation;
	}

	public CurrentWeather getCurrent_weather() {
		return current_weather;
	}

	public void setCurrent_weather(CurrentWeather current_weather) {
		this.current_weather = current_weather;
	}

	public HourlyUnits getHourly_units() {
		return hourly_units;
	}

	public void setHourly_units(HourlyUnits hourly_units) {
		this.hourly_units = hourly_units;
	}

	public Hourly getHourly() {
		return hourly;
	}

	public void setHourly(Hourly hourly) {
		this.hourly = hourly;
	}

	@Override
	public String toString() {
		return "Weather [latitude=" + latitude + ", longitude=" + longitude + ", generationtime_ms=" + generationtime_ms
				+ ", utc_offset_seconds=" + utc_offset_seconds + ", timezone=" + timezone + ", timezone_abbreviation="
				+ timezone_abbreviation + ", elevation=" + elevation + ", current_weather=" + current_weather
				+ ", hourly_units=" + hourly_units + ", hourly=" + hourly + "]";
	}

}
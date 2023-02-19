package model;

import java.time.LocalDateTime;

public class Weather {
	private double temperature;
	private double windspeed;
	private LocalDateTime dateTime;

	private double latitude;
	private double elevation;

	CurrentWeather current_weather;

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getWindspeed() {
		return windspeed;
	}

	public void setWindspeed(double windspeed) {
		this.windspeed = windspeed;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
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

	@Override
	public String toString() {
		return "Weather [temperature=" + temperature + ", windspeed=" + windspeed + ", dateTime=" + dateTime
				+ ", latitude=" + latitude + ", elevation=" + elevation + ", current_weather=" + current_weather + "]";
	}

}
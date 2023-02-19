package model;

import java.time.LocalDateTime;

public class CurrentWeather {
	private double temperature;
	private double windspeed;
	private double winddirection;
	private double weathercode;
	private LocalDateTime time;

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

	public double getWinddirection() {
		return winddirection;
	}

	public void setWinddirection(double winddirection) {
		this.winddirection = winddirection;
	}

	public double getWeathercode() {
		return weathercode;
	}

	public void setWeathercode(double weathercode) {
		this.weathercode = weathercode;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "CurrentWeather [temperature=" + temperature + ", windspeed=" + windspeed + ", winddirection="
				+ winddirection + ", weathercode=" + weathercode + ", time=" + time + "]";
	}

}

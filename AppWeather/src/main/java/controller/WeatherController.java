package controller;

import java.util.Arrays;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dto.Weather;
import proxy.WeatherProxy;

@Controller
public class WeatherController {

	private final WeatherProxy weatherProxy;

	private static final Logger logger = Logger.getLogger(WeatherController.class.getName());

	public WeatherController(WeatherProxy weatherProxy) {
		this.weatherProxy = weatherProxy;
	}

	@GetMapping("/")
	public String weather(Model model) {
		Weather weather = weatherProxy.getWeather(
			44.426, 26.102, true,
			Arrays.asList("temperature_2m", "relativehumidity_2m", "windspeed_10m", "precipitation_probability"),
			"auto"
		);

		logger.info("Received weather data:" + weather.toString());

		model.addAttribute("temperature", weather.getCurrent_weather().getTemperature());
		model.addAttribute("windspeed", weather.getCurrent_weather().getWindspeed());
		model.addAttribute("date", weather.getCurrent_weather().getTime());
		model.addAttribute("weathercode", weather.getCurrent_weather().getWeathercode());
		
		model.addAttribute("hourlyTempUnit", weather.getHourly_units().getTemperature_2m());
		model.addAttribute("hourlyHumidityUnit", weather.getHourly_units().getRelativehumidity_2m());
		model.addAttribute("hourlyWindspeedUnit", weather.getHourly_units().getWindspeed_10m());
		model.addAttribute("hourlyPrecipitationUnit", weather.getHourly_units().getPrecipitation_probability());
		
		model.addAttribute("nextDays", weather.getHourly());
		
		return "weather";
	}

}
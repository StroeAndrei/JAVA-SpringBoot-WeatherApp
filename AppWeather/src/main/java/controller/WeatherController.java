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
		Weather weather = weatherProxy.getWeather(44.42, 26.10, true,
				Arrays.asList("temperature_2m", "relativehumidity_2m", "windspeed_10m"));

		logger.info("Received weather data:" + weather.toString());

		model.addAttribute("temperature", weather.getCurrent_weather().getTemperature());
		model.addAttribute("windspeed", weather.getCurrent_weather().getWindspeed());
		model.addAttribute("date", weather.getCurrent_weather().getTime());
		return "weather";
	}

}
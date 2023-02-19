package controllers;

import java.util.Arrays;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import model.Weather;
import proxy.WeatherProxy;

@Controller
public class WeatherController {
	
	private final WeatherProxy weatherProxy;
	
	private static final Logger logger = Logger.getLogger(WeatherController.class.getName());
	
	public WeatherController(WeatherProxy weatherProxy) {
		this.weatherProxy = weatherProxy;
	}
	
	@GetMapping("/weather")
    public String weather(Model model) {
        Weather weather = weatherProxy.getWeather(44.42, 26.10, true, Arrays.asList("temperature_2m", "relativehumidity_2m", "windspeed_10m"));
        
        logger.info("Received weather data:" + weather.toString());
        
        model.addAttribute("temperature", weather.getCurrent_weather().getTemperature());
        model.addAttribute("windspeed", weather.getCurrent_weather().getWindspeed());
        model.addAttribute("date", weather.getCurrent_weather().getTime());
        return "weather";
    }
	
}

/**



@Controller
public class WeatherController {

    @Autowired
    private WeatherProxy weatherProxy;

    @GetMapping("/weather")
    public String weather(Model model) {
        // Make an HTTP request to the remote weather service
        Weather weather = weatherProxy.createWeather(44.4375, 26.125, true, Arrays.asList("temperature_2m", "relativehumidity_2m", "windspeed_10m"));

        // Extract the relevant data from the response and add it to the Model object
        model.addAttribute("temperature", weather.getCurrentWeather().getTemperature() + " °C");
        model.addAttribute("windspeed", weather.getCurrentWeather().getWindspeed() + " km/h");
        model.addAttribute("date", weather.getCurrentWeather().getTime());

        // Return the name of the view to be rendered
        return "weather";
    }

}


	<h1>Weather</h1>
	<p>Temperature: th:text="${temperature}"</p>
	<p>Windspeed: th:text="${windspeed}"</p>
	<p>Date: th:text="${date}"</p>



**/
package proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dto.Weather;

/**
 * @author Andrei
 * OpenFeign REST Client
 * path = name.service.url+request params
 */
@FeignClient(name = "weather", url = "${name.service.url}")
public interface WeatherProxy {
	
	@GetMapping("/")
	Weather getWeather(
		@RequestParam("latitude") Double latitude,
		@RequestParam("longitude") Double longitude,
		@RequestParam("current_weather") boolean currentWeather,
		@RequestParam("hourly") List<String> hourly,
		@RequestParam("timezone") String timezone
	);
}
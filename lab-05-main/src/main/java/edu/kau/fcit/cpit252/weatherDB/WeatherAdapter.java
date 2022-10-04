
package edu.kau.fcit.cpit252.weatherDB;
import edu.kau.fcit.cpit252.WeatherCity;
import edu.kau.fcit.cpit252.WeatherGeo;
import edu.kau.fcit.cpit252.geoLocation.GeoLocation;

public class WeatherAdapter implements WeatherGeo {

    private GeoLocation geoLocation;
    private WeatherCity wCity;

    public WeatherAdapter(WeatherCity wCity){
        this.geoLocation = new GeoLocation();
        this.wCity = wCity;
    }

    public String getWeatherInfo(double latitude, double longtitude){
        String stringCity = this.geoLocation.search(latitude,longtitude);
        return wCity.getWeatherInfo(stringCity);
    }

}

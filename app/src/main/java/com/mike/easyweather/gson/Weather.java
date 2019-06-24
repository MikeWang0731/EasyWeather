package com.mike.easyweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/*
In the Weather class, we referenced Basic, AQI, Now, Suggestion, and Forecast.
Where, since daily_forecast contains an array, the List collection is used to reference the Forecast class.
In addition, the returned weather data will also contain a status data, successful return ok,
failure will return the specific reason, so here also need to add a corresponding status field.
 */
public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}

package com.hunau.myweather.service;


import com.hunau.myweather.entity.Weather;
import com.hunau.myweather.entity.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WeatherReportService {

    @Autowired
    private WeatherDataService weatherDataService;


    public Weather getDataByCityId(String cityId) {
        WeatherResponse response = weatherDataService.getDataByCityId(cityId);
        return response.getData();
    }
}

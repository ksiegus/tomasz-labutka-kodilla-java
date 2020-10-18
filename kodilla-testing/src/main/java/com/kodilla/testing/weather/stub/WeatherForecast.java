package com.kodilla.testing.weather.stub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double getAverage() {
        double sum = 0.0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){
            sum += temperature.getValue();
        }
        return temperatures.getTemperatures().size() > 0 ?  sum/temperatures.getTemperatures().size() : -1;
    }


    public double getMedian() {
        int k = 0;
        double[] tempArray = new double[5];

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){
            tempArray[k++] = temperature.getValue();
        }


        Arrays.sort(tempArray);
        if (tempArray.length % 2 == 0) {
            return (tempArray[tempArray.length/2] + tempArray[tempArray.length/2 - 1]) / 2;
        }
        return tempArray[tempArray.length/2];
    }


}
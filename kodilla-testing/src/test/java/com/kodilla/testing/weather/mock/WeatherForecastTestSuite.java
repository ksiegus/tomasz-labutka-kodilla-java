package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import java.util.*;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    private static Map<String, Double> temperaturesMap = new HashMap<>();
    private static int testCounter = 0;
    private static double averageExpected = 0;
    private static double medianExpected = 0;

    @Mock
    private Temperatures temperaturesMock;

    @BeforeAll
    public static void beforeAllTests() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

        averageExpected = 25.56;
        medianExpected = 25.5;

        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @Test
    void testCalculateForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(this.temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAvarageForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(this.temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double average = weatherForecast.getAverage();

        //Then
        Assertions.assertEquals(averageExpected, average);
    }

    @Test
    void testMedianForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(this.temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double median = weatherForecast.getMedian();

        //Then
        Assertions.assertEquals(medianExpected, median);
    }

}
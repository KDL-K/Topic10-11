package com.shevlik.Topic9;

public interface VehicleList {
    void showCarList();
    void addToCarList();
    void showCarByBrand(String brand);
    void showCarByEngine(String engine);
    void showCarByTransmission(String transmission);
    void showCarById(int id)throws CarException;
}

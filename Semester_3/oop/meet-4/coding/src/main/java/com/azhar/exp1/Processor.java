package com.azhar.exp1;

public class Processor {
    private String brand;
    private double cache;

    public Processor() {

    }

    public Processor(String brand, double cache) {
        this.brand = brand;
        this.cache = cache;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public void info() {
        System.out.printf("Brand Processor = %s\n", brand);
        System.out.printf("Brand Processor = %.2f\n", cache);
    }
}

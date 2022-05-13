package web.controller;

public class Car {

    private String model;
    private int series;
    private String plate;

    public Car (String model, int series, String plate){
        this.model = model;
        this.series = series;
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public String getPlate() {
        return plate;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}

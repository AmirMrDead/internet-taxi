package entity;

import base.BaseEntity;
import entity.enums.CarType;

public class Car implements BaseEntity {

    private Integer id;
    private String name;
    private String plaque;
    private CarType type;

    public Car(String name, String plaque, CarType type) {
        this.name = name;
        this.plaque = plaque;
        this.type = type;
    }

    public Car() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaque() {
        return plaque;
    }

    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}

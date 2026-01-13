package com.xworkz.vehicle.dto;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class VehicleDTO {

    private int vehicleId;
    private String vehicleName;
    private String vehicleType;
    private String vehicleNumber;
    private int price;

    public VehicleDTO(int vehicleId, String vehicleName, String vehicleType, String vehicleNumber, int price) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.price = price;

    }

    @Override
    public String toString() {
        return "VehicleDTO{" +
                "vehicleId=" + vehicleId +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehicleDTO)) return false;
        VehicleDTO that = (VehicleDTO) o;
        return vehicleId == that.vehicleId && price == that.price && Objects.equals(vehicleName, that.vehicleName) && Objects.equals(vehicleType, that.vehicleType) && Objects.equals(vehicleNumber, that.vehicleNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleId, vehicleName, vehicleType, vehicleNumber, price);
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

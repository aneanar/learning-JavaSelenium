package Day11;

import java.util.HashSet;
import java.util.List;

public class HyundaiCustomerInfo {


    private String name;
    private String city;
    private String state;
    private String carModel;
    private HashSet<String> phoneNumbers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public HashSet<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(HashSet<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }



}

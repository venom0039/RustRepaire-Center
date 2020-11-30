package Source;

public class AddNewVehicleSource {
    String vin;
    String chassisNo;
    String fuel;
    String type;
    String brand;
    String model;
    String color;
    int year;
    String ownerName;
    String nic;
    String address;
    String email;
    String contact;
    String date;

    public AddNewVehicleSource(String vin, String chassisNo, String fuel, String type, String brand, String model, String color, int year, String ownerName, String nic, String address, String email, String contact, String date) {
        this.vin = vin;
        this.chassisNo = chassisNo;
        this.fuel = fuel;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.nic = nic;
        this.address = address;
        this.email = email;
        this.contact = contact;
        this.date = date;
    }

    public AddNewVehicleSource(String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6, int aInt, String string7, String string8, String string9, String string10, String string11, String string12) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}

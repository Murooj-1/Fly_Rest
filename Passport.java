/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Passport {

    private String Passpor;
    private String CityOfPassport;
    private String PassportNumber;
    private int dayofPassport;
    private int monthofPassport;
    private int yearofPassport;

    public Passport() {
    }

    public Passport(String Passpor) {
        this.Passpor = Passpor;
    }

    public Passport(String Passpor, String PassportNumber) {
        this.Passpor = Passpor;
        this.PassportNumber = PassportNumber;

    }

    public Passport(String Passpor, String CityOfPassport, String PassportNumber) {
        this.Passpor = Passpor;
        this.CityOfPassport = CityOfPassport;
        this.PassportNumber = PassportNumber;
    }

    public void setPasspor(String Passpor) {
        this.Passpor = Passpor;
    }

    public void setCityOfPassport(String CityOfPassport) {
        this.CityOfPassport = CityOfPassport;
    }

    public void setPassportNumber(String PassportNumber) {
        this.PassportNumber = PassportNumber;
    }

    public String getPasspor() {
        return Passpor;
    }

    public String getCityOfPassport() {
        return CityOfPassport;
    }

    public String getPassportNumber() {
        return PassportNumber;
    }

    String getPassport() {
       return Passpor;
    }

}
